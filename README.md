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
    + tocar(): void
    + pausar(Date tempo): void
    + selecionarMusica(int id): void
  }

  class NavegadorInternet {
    -String urlPagina
    +exibirPagina()
    +adicionarNovaAba()
    +atualizarPagina()
  }

  AparelhoTelefonico "1" *-- "N" ReprodutorMusicial
  AparelhoTelefonico "1" *-- "N" NavegadorInternet