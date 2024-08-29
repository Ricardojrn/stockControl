package org.control;
import java.util.ArrayList;

public class Estoque {
    private ArrayList<Medicamento> medicamentos;

    public Estoque() {
        this.medicamentos = new ArrayList<>();
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public void listarMedicamentos() {
        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento cadastrado.");
        } else {
            for (Medicamento medicamento : medicamentos) {
                System.out.println(medicamento);
            }
        }
    }

    public void removerMedicamento(String nome) {
        Medicamento medicamento = encontrarMedicamento(nome);
        if (medicamento != null) {
            medicamentos.remove(medicamento);
            System.out.println("Medicamento removido com sucesso.");
        } else {
            System.out.println("Medicamento não encontrado.");
        }
    }

    public void entradaEstoque(String nome, int quantidade) {
        Medicamento medicamento = encontrarMedicamento(nome);
        if (medicamento != null) {
            medicamento.adicionarEstoque(quantidade);
            System.out.println("Entrada de estoque realizada com sucesso.");
        } else {
            System.out.println("Medicamento não encontrado.");
        }
    }

    public void saidaEstoque(String nome, int quantidade) {
        Medicamento medicamento = encontrarMedicamento(nome);
        if (medicamento != null) {
            medicamento.removerEstoque(quantidade);
        } else {
            System.out.println("Medicamento não encontrado.");
        }
    }

    private Medicamento encontrarMedicamento(String nome) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNome().equalsIgnoreCase(nome)) {
                return medicamento;
            }
        }
        return null;
    }
}
