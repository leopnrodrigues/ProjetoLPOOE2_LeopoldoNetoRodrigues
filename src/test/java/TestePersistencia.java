/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.edu.ifsul.passofundo.projetolpooe1_leopoldonetorodrigues.dao.PersistenciaJPA;
import java.time.LocalDateTime;
import model.Funcionario;
import model.Marca;
import model.Motorista;
import model.Passagem;
import model.Tipo;
import model.Turno;
import model.Veiculo;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20231PF.CC0030
 */
public class TestePersistencia {
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    
    
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
@Test
    public void testePersistencia() {
        try {

            Veiculo v1 = new Veiculo();
            v1.setPlaca("AAA1234");
            v1.setCor("Branco");
            v1.setTipo(Tipo.CARRO);
            v1.setMarca(Marca.FIAT);
            v1.setDescricao("Uno com escada em cima");

            Veiculo v2 = new Veiculo();
            v2.setPlaca("BBB5678");
            v2.setCor("Preto");
            v2.setTipo(Tipo.CAMINHONETE);
            v2.setMarca(Marca.FORD);
            v2.setDescricao("F250");

            Motorista m1 = new Motorista();
            m1.setNome("Josevaldo");
            m1.setCpf("12345678900");
            m1.setTelefone("11999999999");
            m1.setEmail("josevaldo@firma.com.br");
            m1.setCnh("987123456");

            Funcionario f1 = new Funcionario();
            f1.setNome("Robson");
            f1.setCabine(1);
            f1.setCpf("00988877766");
            f1.setTelefone("(54)999888777");
            f1.setEmail("robson@pedagio.com.br");
            f1.setTurno(Turno.TARDE);

            Passagem p1 = new Passagem();
            p1.setCabine(1);
            p1.setValorPago(5.50);
            p1.setVeiculo(v1);
            v1.addPassagem(p1);
            p1.setMotorista(m1);
            p1.setFuncionario(f1);
            p1.setDataHora(LocalDateTime.now()); // Passagem 1

            Passagem p2 = new Passagem();
            p2.setCabine(1);
            p2.setValorPago(7.00);
            p2.setVeiculo(v2);
            v2.addPassagem(p2);
            p2.setMotorista(m1);
            p2.setFuncionario(f1);
            p2.setDataHora(LocalDateTime.now().plusHours(2)); // Passagem 2

            Veiculo v3 = new Veiculo();
            v3.setPlaca("CCC9876");
            v3.setCor("Vermelho");
            v3.setTipo(Tipo.MOTOCICLETA);
            v3.setMarca(Marca.HONDA);
            v3.setDescricao("CB");

            Motorista m2 = new Motorista();
            m2.setNome("Maria");
            m2.setCpf("23456789001");
            m2.setTelefone("11988888888");
            m2.setEmail("maria@firma.com.br");
            m2.setCnh("123456789");

            Funcionario f2 = new Funcionario();
            f2.setNome("Carlos");
            f2.setCabine(2);
            f2.setCpf("11223344556");
            f2.setTelefone("(54)99999999");
            f2.setEmail("carlos@pedagio.com.br");
            f2.setTurno(Turno.DIA);

            Passagem p3 = new Passagem();
            p3.setCabine(2);
            p3.setValorPago(10.00);
            p3.setVeiculo(v3);
            v3.addPassagem(p3);
            p3.setMotorista(m2);
            p3.setFuncionario(f2);
            p3.setDataHora(LocalDateTime.now().plusHours(4)); // Passagem 3
            
            Motorista m3 = new Motorista();
            m3.setNome("Bruna");
            m3.setCpf("45678901234");
            m3.setTelefone("11911112222");
            m3.setEmail("bruna@firma.com.br");
            m3.setCnh("123789456");

            Funcionario f3 = new Funcionario();
            f3.setNome("Ana");
            f3.setCabine(3);
            f3.setCpf("98765432100");
            f3.setTelefone("(54)88887777");
            f3.setEmail("ana@pedagio.com.br");
            f3.setTurno(Turno.MADRUGADA);

            Passagem p4 = new Passagem();
            p4.setCabine(3);
            p4.setValorPago(6.50);
            p4.setVeiculo(v1);
            v1.addPassagem(p4);
            p4.setMotorista(m3);
            p4.setFuncionario(f3);
            p4.setDataHora(LocalDateTime.now().plusHours(6)); // Passagem 4
            
            jpa.persist(m1);
            jpa.persist(f1);
            jpa.persist(m2);
            jpa.persist(f2);
            jpa.persist(m3);
            jpa.persist(f3);

            jpa.persist(v1);
            jpa.persist(v2);
            jpa.persist(v3);

            jpa.persist(p1);
            jpa.persist(p2);
            jpa.persist(p3);
            jpa.persist(p4);
            
        } catch (Exception e) {
            System.err.println("Erro ao persistir dados: " + e.getMessage());
            e.printStackTrace();
            assertTrue("Erro ao persistir", false);
        }
    }
}
