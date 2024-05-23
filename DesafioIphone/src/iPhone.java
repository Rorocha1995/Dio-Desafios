public class iPhone implements  ReprodutorMusical, AparelhoTelefonico,NavegadorInternet{
        // Métodos da interface ReprodutorMusical
        @Override
        public void play() {
            System.out.println("Reproduzindo música...");
        }

        @Override
        public void pause() {
            System.out.println("Música pausada.");
        }

        @Override
        public void stop() {
            System.out.println("Música parada.");
        }

        // Métodos da interface AparelhoTelefonico
        @Override
        public void ligar() {
            System.out.println("Fazendo uma ligação...");
        }

        @Override
        public void atender() {
            System.out.println("Atendendo a ligação.");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz...");
        }

        // Métodos da interface NavegadorInternet
        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }

        @Override
        public void adicionarNovaAba(String url) {
            System.out.println("Adicionando nova aba com URL: " + url);
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando a página.");
        }
    }



