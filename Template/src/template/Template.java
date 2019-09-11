package template;
import relatorio.Relatorio;
import relatorio.pdf;
import relatorio.txt;

public class Template {
    public static void main(String[] args) {
       Relatorio r = new pdf();
       //Abstract não pode ser private
       r.exportar();
    }
    
}
