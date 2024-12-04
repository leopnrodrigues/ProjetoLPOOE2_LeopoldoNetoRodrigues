/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.passofundo.projetolpooe1_leopoldonetorodrigues.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Funcionario;
import model.Marca;
import model.Passagem;
import model.Pessoa;
import model.Tipo;
import model.Turno;
import model.Veiculo;

public class PersistenciaJPA implements InterfaceBD{
    public EntityManager entity;
    public EntityManagerFactory factory;
    
    public PersistenciaJPA() {
        factory = Persistence.createEntityManagerFactory("ProjetoLPOOE1_LeopoldoNetoRodrigues");
               
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void persist(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            if (!entity.contains(o)) {
                o = entity.merge(o); // Anexa o objeto ao contexto de persistência, se necessário
            }
            entity.persist(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
            Logger.getLogger(PersistenciaJPA.class.getName()).log(Level.SEVERE, "Erro ao persistir a entidade: " + o.getClass().getSimpleName(), e);
            e.printStackTrace(); // Isso imprimirá o erro completo no console
            throw e;
        }
    }

    @Override
    public void remover(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            if (!entity.contains(o)) {
                o = entity.merge(o); // Garantir que o objeto está no contexto de persistência
            }
            entity.remove(o); // Remover o objeto
            entity.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Erro ao remover entidade: " + o.getClass().getSimpleName());
            e.printStackTrace();
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }
    
    public EntityManager getEntityManager() {
        if(entity == null || !entity.isOpen()) {
            entity = factory.createEntityManager();
        }
        return entity;
    }
    
    public List<Funcionario> getFunc() {
       entity = getEntityManager();

       try {
           TypedQuery<Funcionario> query
                   = entity.createQuery("Select f from Funcionario f", Funcionario.class);
           return query.getResultList();
       } catch (Exception e) {
           System.err.println("Erro ao buscar funcionario: " + e);
           return null;
       }

   }
 
    public List<Funcionario> getFunc(Turno turno) {
        entity = getEntityManager();

        try {
            TypedQuery<Funcionario> query
                    = entity.createQuery("Select f from Funcionario f where f.turno= '"
                            + turno + "'",
                            Funcionario.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar func: " + e);
            return null;
        }

    }

    public List<Funcionario> getFunc(String nome) {
        entity = getEntityManager();

        try {
            TypedQuery<Funcionario> query
                    = entity.createQuery("Select f from Funcionario f where lower(f.nome) LIKE :n",
                            Funcionario.class);
            query.setParameter("n", "%" + nome.toLowerCase() + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }

    }
     
    public List<Veiculo> getVeiculos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Veiculo> query
                    = em.createQuery("SELECT v FROM Veiculo v", Veiculo.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Veiculo> getVeiculos(String placa) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Veiculo> query
                    = em.createQuery("SELECT v FROM Veiculo v where lower(v.placa) LIKE :p", Veiculo.class);
            query.setParameter("p", "%" + placa.toLowerCase() + "%");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Veiculo findVeiculoByPlaca(String placa) {
        EntityManager em = getEntityManager();
        Veiculo veiculo = null;

        try {
            em.getTransaction().begin();
            veiculo = em.createQuery("SELECT v FROM Veiculo v WHERE upper(v.placa) = :placa", Veiculo.class)
                    .setParameter("placa", placa.toUpperCase())
                    .getSingleResult();
        } catch (NoResultException e) {
            System.out.println("Nenhum veículo encontrado com a placa: " + placa);
        } catch (Exception e) {
            Logger.getLogger(PersistenciaJPA.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            em.close();
        }

        return veiculo;
    }
    
    public List<Marca> getModelos() {
        entity = getEntityManager();

        try {
            TypedQuery<Marca> query
                    = entity.createQuery("Select p from Marca p", Marca.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar: " + e);
            return null;
        }

    }
    
    public List<Tipo> getTipos() {
        entity = getEntityManager();

        try {
            TypedQuery<Tipo> query
                    = entity.createQuery("Select p from Tipo p", Tipo.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar: " + e);
            return null;
        }

    }
    
    public Veiculo getVeiculoByPlaca(String placa) {
        Veiculo veiculo = null;
        try {
            // Assume que você tenha uma busca baseada na placa
            veiculo = entity.createQuery("SELECT v FROM Veiculo v WHERE v.placa = :placa", Veiculo.class)
                         .setParameter("placa", placa)
                         .getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            // Tratamento de exceção, caso o veículo não seja encontrado
        }
    return veiculo;
}

    
    public List<Passagem> getMovimentacoes() {
        entity = getEntityManager();

        try {
            TypedQuery<Passagem> query
                    = entity.createQuery("Select p from Pasagem p", Passagem.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar registros: " + e);
            return null;
        }

    }
}
