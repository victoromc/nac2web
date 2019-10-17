<!-- Inserir cabeçalho -->
<%@include file="header.jsp"%>
<section class="container">
	<div class="frm">
		<!-- Crie um formulário para validação de login -->
		<form action="login" method="post">
			<label>Email</label> 
			<input type="email" id="email" name="email"/>
			<label> Senha </label>
			<input type="password" id="pwd" name="pwd"/>
			<button>Login</button>
			<p>${erro}</p>
		</form>

	</div>
</section>

<!-- Inserir rodapé -->
<%@include file="footer.jsp"%>