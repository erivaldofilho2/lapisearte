package lapisearte.controle;

import java.io.FileOutputStream;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import lapisearte.entidade.Aluno;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class CriaPDF {

	public CriaPDF(){

	}
	
	public Document criarDeclaracao(Aluno aluno) {
		System.out.println("entrou na funcao");
		Document pdf = new Document(PageSize.A4);
		System.out.println("criou o pdf");
		FileOutputStream os = null;
		try {
			
			os = new FileOutputStream("/home/erivaldo/git/lapisearte/lapisearte/WebContent/arquivos/"+aluno.getId()+".pdf");
			System.out.println("Criou arquivo");
			PdfWriter.getInstance(pdf, os);
			pdf.open();
			// pdf.addHeader("teste", "teste");

			Image logo = Image
					.getInstance("/home/erivaldo/git/lapisearte/lapisearte/WebContent/img/logo.png");
			logo.setAlignment(Element.ALIGN_CENTER);
			logo.scaleAbsolute(75, 75);
			pdf.add(logo);
			
			//Texto do Cabecalho
			Font f1 = new Font(FontFamily.TIMES_ROMAN, 24, Font.BOLD);
			Font f2 = new Font(FontFamily.TIMES_ROMAN, 14, Font.BOLD);
			Paragraph cabessalho = new Paragraph("Escola Lápis e Arte", f1);
			Paragraph info = new Paragraph(
					"Rua Santa Cecília, nº 11 – Clima Bom / Maceió – Alagoas. \nCNPJ: 05.324.220/0001-94 \nINEP: 27332012 \nTel.: (82) 3342-5586");
			info.setAlignment(Element.ALIGN_CENTER);
			cabessalho.setAlignment(Element.ALIGN_CENTER);
			cabessalho.add(info);
			pdf.add(cabessalho);
			
			//Texto da declaração
			Paragraph p2 = new Paragraph("\n\n\n\n\nDECLARAÇÃO\n\n", f2);
			p2.setAlignment(Element.ALIGN_CENTER);
			Paragraph decl = new Paragraph(
					"   Declaro para os devidos fins que se fizerem necessários que "
							+ aluno.getNome()
							+ " Encontra-se matriculado neste estabelecimento de ensino cursando o(a)");
			decl.setAlignment(Element.ALIGN_JUSTIFIED);
			pdf.add(p2);
			pdf.add(decl);
			
			//Configuracao da data
			Paragraph data = new Paragraph();
			Calendar calendar = Calendar.getInstance();
			data.add("\n\n\n\n\nMaceió/AL, " + calendar.get(calendar.DAY_OF_MONTH)
					+ " de " + mes(calendar.MONTH) + " de "
					+ calendar.get(calendar.YEAR));
			data.setAlignment(Element.ALIGN_CENTER);
			pdf.add(data);
			
			//Responsavel 
			Paragraph responsavel = new Paragraph("\n\n\n\n\n______________________________________________\nFuncionário Responsável");
			responsavel.setAlignment(Element.ALIGN_CENTER);
			pdf.add(responsavel);

			System.out.println("PDF Criado com sucesso!!");

		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pdf != null) {
				// fechamento do documento
				pdf.close();
			}
			if (os != null) {
				// fechamento da stream de saída
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return pdf;

	}

	public String mes(int i) {

		if (i == 1) {
			return "Janeiro";
		} else if (i == 2) {
			return "Fevereiro";
		} else if (i == 3) {
			return "Março";
		} else if (i == 4) {
			return "Abril";
		} else if (i == 5) {
			return "Maio";
		} else if (i == 6) {
			return "Junho";
		} else if (i == 7) {
			return "Julho";
		} else if (i == 8) {
			return "Agosto";
		} else if (i == 9) {
			return "Setembro";
		} else if (i == 10) {
			return "Outubro";
		} else if (i == 11) {
			return "Novembro";
		} else if (i == 12) {
			return "Dezembro";
		} else {
			return "Data nao econtrada";
		}

	}

}
