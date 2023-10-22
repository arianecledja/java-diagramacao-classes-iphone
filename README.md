# Diagramação de Classes do Iphone

```mermaid
  classDiagram
	class AparelhoTelefonico {
    -Number numeroTelefone
    +ligar(Number numeroTelefone): void
    +atender(): void
    +iniciarCorreioVoz(): void
  }

  class ReprodutorMusicial {
  	-Number id
    -String musica
    -Date tempo
    + tocar(Number id): void
    + pausar(Date tempo): void
    + selecionarMusica(Number id): void
  }

  class NavegadorInternet {
    -String urlPagina
    +exibirPagina(): void
    +adicionarNovaAba(): void
    +atualizarPagina(): void
  }

  AparelhoTelefonico "1" *-- "N" ReprodutorMusicial
  AparelhoTelefonico "1" *-- "N" NavegadorInternet