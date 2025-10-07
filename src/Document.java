/**
 * Represents a text document that can be indexed and searched.
 *
 * <p>This class stores metadata about the document (such as file name or path)
 * and provides access to its tokenized content. Each Document instance corresponds
 * to a single text file in the dataset being indexed by the search engine.</p>
 *
 * <p>Responsibilities of this class typically include:</p>
 * <ul>
 *   <li>Reading and storing the document’s raw text.</li>
 *   <li>Tokenizing the content into individual words (or terms).</li>
 *   <li>Providing access to word lists or positions for indexing.</li>
 * </ul>
 *
 * <p>Example usage:</p>
 * <pre>{@code
 * Document doc = new Document("sample.txt");
 * List<String> tokens = doc.getTokens();
 * }</pre>
 *
 * @author Prithu Dutta
 * @version 1.0
 */

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Document {
    private final String filePath;
    private final String fileName;
    private String rawText;
    private List<String> tokens;

    // Constructor for a single file
    public Document(File file) throws IOException {
        this.filePath = file.getAbsolutePath();
        this.fileName = file.getName();
        readFile();
        tokenize();
    }

    private void readFile() throws IOException {
        rawText = Files.readString(Paths.get(filePath));
    }

    private void tokenize() {
        tokens = Arrays.asList(rawText
                .toLowerCase()
                .replaceAll("[^a-z0-9\\s]", "")  // remove punctuation
                .split("\\s+"));                 // split by whitespace
    }

    public List<String> getTokens() {
        return tokens;
    }

    public String getRawText() {
        return rawText;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }
}
