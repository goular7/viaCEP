package org.aplicacao;

import org.aplicacao.servico.ApiServico;
import org.aplicacao.servico.dto.EnderecoDto;

import java.io.IOException;

public class Main {

    public static void main(String[] args){

        ApiServico apiServico = new ApiServico();
        try {

            EnderecoDto enderecoDto = apiServico.getEndereco("03107040");
            System.out.println("CEP: "+enderecoDto.getCep());
            System.out.println("Cidade: "+enderecoDto.getLocalidade());
            System.out.println("Rua: "+enderecoDto.getLogradouro());
            System.out.println("Bairro: "+enderecoDto.getBairro());



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
