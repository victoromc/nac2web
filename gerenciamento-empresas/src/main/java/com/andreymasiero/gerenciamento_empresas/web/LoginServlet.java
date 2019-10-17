package com.andreymasiero.gerenciamento_empresas.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.andreymasiero.gerenciamento_empresas.dao.UsuarioDAO;
import com.andreymasiero.gerenciamento_empresas.entities.Usuario;

/**
 * 
 * Classe que executa o login do usuário após receber a requisição.
 *
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 8358808977406161971L;

	/**
	 * 
	 * Esse método efetua o login do usuário, consultando um método da classe DAO.
	 * 
	 * Em caso de autenticacao realizada com sucesso, deve armazenar o usuário na
	 * sessão e redirecionar para a página gerenciador.jsp.
	 * 
	 * Em caso de falha na autenticacao, um atributo erro deve ser adicionado e
	 * retornando na própria index.jsp informando o erro.
	 * 
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @throws ServletException, IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		
		Usuario u = new UsuarioDAO().buscaPorEmailESenha(req.getParameter("email").toLowerCase(),
				req.getParameter("pwd"));
		if (u != null) {
			HttpSession session = req.getSession();
			session.setAttribute("usuario", u);
			RequestDispatcher r = req.getRequestDispatcher("gerenciador.jsp");
			r.forward(req, resp);
			

		} else {
			req.setAttribute("erro", "Usuario e/ou senha inválidos"); 
			req.getRequestDispatcher("index.jsp").forward(req, resp); 
		}
		
		
	}

}
