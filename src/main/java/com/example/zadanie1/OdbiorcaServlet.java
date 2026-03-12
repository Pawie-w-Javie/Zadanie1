package com.example.zadanie1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/odbierz-dane")
public class OdbiorcaServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // ustawiamy kodowanie jak w .jsp, pomaga przy polskich snakach
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        // robimy zmienne i pobieramy wartosci po value z formsa
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String wiek = request.getParameter("wiek");

        // pobieramy zawartości checkboxów jako tablice
        String[] hobby = request.getParameterValues("hobby");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Dane odebrane pomyślnie!</h1>");
        out.println("<p>Imię i nazwisko: " + imie + " " + nazwisko + "</p>");
        out.println("<p>Wiek: " + wiek + "</p>");
        if (hobby != null) {
        out.println("<p>Zainteresowania:</p><ul>");
            for (String h : hobby) {
                out.println("<li>" + h + "</li>");
            }
        } else {
            out.println("All Right Then, Keep Your Secrets <br>");
        }
        out.println("</ul>");

        out.println("<a href='index.jsp'>Powrót do indexu</a>");
        out.println("<a href='formularz.jsp'>Powrót do forularza</a>");
        out.println("</body></html>");
    }

}
