public class PruebaSistemaExportacion {
    public static void main(String[] args) {
        // Crear un documento y exportar a PDF
        Documento documentoPDF = new Documento();
        documentoPDF.exportarPDF();  // Exportar a PDF

        // Crear un documento y exportar a Word
        DocumentoWord documentoWord = new DocumentoWord();
        documentoWord.exportarWord();  // Exportar a Word

        // Crear un documento y exportar a Excel
        DocumentoExcel documentoExcel = new DocumentoExcel();
        documentoExcel.exportarExcel();  // Exportar a Excel
    }
}

