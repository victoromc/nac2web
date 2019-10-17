
<!-- Inserir cabeçalho -->
<%@include file="header.jsp"%>
<!-- Uso de JSTL é obrigatório -->

<section class="container">
	<!-- Exiba o email do usuário junto com uma saudação -->
	<p class="greeting">OLÁ ${usuario.getEmail()}, SEJA BEM-VINDO!</p>

	<hr />
	<h2>Cadastrar Nova Empresa</h2>

	<!-- Mensagem de cadastro com sucesso deve ser exibida aqui -->
	<p>${sucesso }</p>


	<!-- Formulário para cadastrar nova empresa -->
	<div class="frm">
		<form action="cadastrar" method="post">

			<input type="text" id="novaEmpresa" name="novaEmpresa"
				placeholder="Digite o nome da empresa para cadastrar" />

			<button>Cadastrar</button>

		</form>
	</div>
	<hr />
	<h2>Empresas Cadastradas</h2>

	<!-- Formulário para filtrar as empresas cadastradas -->
	<div class="frm">
		<form action="filtrar" method="get">

			<input type="text" id="buscaEmpresa" name="buscaEmpresa"
				placeholder="Digite o nome que deseja buscar" />

			<button>Buscar</button>
	</div>
	<!-- 
		Exibir a lista das empresas filtradas, caso não haja filtro, todas as empresas devem
		aparecer na lista
	 -->
	<p>${busca }</p>






</section>

<!-- Inserir rodape -->
<%@include file="footer.jsp"%>