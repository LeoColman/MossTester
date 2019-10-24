# MossTester

Repositório simples para enviar arquivos ao Moss e verificar se os arquivos fonte enviados serão considerados plágio pela ferramenta.

O Moss é uma ferramenta utilizada por professores de universidades pelo mundo para verificar a possibilidade de plágio entre trabalhos dos alunos.

## QuickStart

###### Para uma rapida implementação do sistema:

- Clone o repositório em seu computador
- Mova a pasta QuickStart para a pasta raiz do seu computador, ou seja, *C:\QuickStart*
- Em seguida coloque os arquivos que deseja verificar na pasta ArquivosParaTeste seguindo essa hierarquia:

	¬ArquivosParaTeste

		¬Aluno1
        
			¬arquivoX.java

		¬Aluno2

			¬arquivoY.java

		¬Aluno3

			¬arquivoZ.java


- Abra a pasta QuickStart em seu Eclipse e execute o arquivo main.java.
- Será solicitado o ID do moss o qual deve ser aquirido seguindo as instruções desse [link](http://theory.stanford.edu/~aiken/moss/)
- O programa então retornará um link com os resultados das comparações 