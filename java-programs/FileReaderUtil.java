import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

/**
 * A file reader utility that demonstrates reading files with various methods.
 * Demonstrates: File I/O, Java NIO, Streams, exception handling, and data processing.
 */
public class FileReaderUtil {
    
    private String filePath;
    
    public FileReaderUtil(String filePath) {
        this.filePath = filePath;
    }
    
    /**
     * Read file using BufferedReader (traditional approach)
     */
    public List<String> readWithBufferedReader() throws IOException {
        List<String> lines = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        
        return lines;
    }
    
    /**
     * Read file using Java NIO Files.readAllLines (simple approach)
     */
    public List<String> readWithNIO() throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
    
    /**
     * Read file using Java NIO with Stream (modern approach)
     */
    public Stream<String> readWithStream() throws IOException {
        return Files.lines(Paths.get(filePath));
    }
    
    /**
     * Read entire file content as a single String
     */
    public String readEntireFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
    
    /**
     * Get file statistics
     */
    public Map<String, Object> getFileStatistics() throws IOException {
        Map<String, Object> stats = new HashMap<>();
        Path path = Paths.get(filePath);
        
        stats.put("fileName", path.getFileName().toString());
        stats.put("fileSize", Files.size(path));
        stats.put("lineCount", Files.lines(path).count());
        stats.put("wordCount", Files.lines(path)
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .count());
        stats.put("characterCount", Files.lines(path)
                .mapToInt(String::length)
                .sum());
        stats.put("lastModified", Files.getLastModifiedTime(path).toMillis());
        
        return stats;
    }
    
    /**
     * Search for a pattern in the file
     */
    public List<String> searchPattern(String pattern) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            return lines
                    .filter(line -> line.toLowerCase().contains(pattern.toLowerCase()))
                    .collect(Collectors.toList());
        }
    }
    
    /**
     * Get word frequency map from the file
     */
    public Map<String, Long> getWordFrequency() throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            return lines
                    .flatMap(line -> Arrays.stream(line.toLowerCase().split("\\W+")))
                    .filter(word -> !word.isEmpty())
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        }
    }
    
    /**
     * Write content to a new file
     */
    public void writeToFile(String content, String outputPath) throws IOException {
        Files.write(Paths.get(outputPath), content.getBytes());
        System.out.println("Content written to: " + outputPath);
    }
    
    /**
     * Append content to existing file
     */
    public void appendToFile(String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.APPEND);
        System.out.println("Content appended to: " + filePath);
    }
    
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileReaderUtil <filename> [operation]");
            System.out.println("Operations: read, stats, search <pattern>, wordfreq, write <output>");
            System.out.println("\nCreating sample file for demonstration...");
            
            // Create a sample file for demonstration
            String sampleFile = "sample.txt";
            String sampleContent = 
                "Hello World! This is a sample text file.\n" +
                "Java is a powerful programming language.\n" +
                "File reading is an essential skill for developers.\n" +
                "This file demonstrates various file reading techniques.\n" +
                "Thank you for using FileReaderUtil!";
            
            try {
                Files.write(Paths.get(sampleFile), sampleContent.getBytes());
                System.out.println("Sample file created: " + sampleFile);
                
                FileReaderUtil reader = new FileReaderUtil(sampleFile);
                
                System.out.println("\n=== File Reader Demonstration ===\n");
                
                // Read with different methods
                System.out.println("1. Reading with BufferedReader:");
                List<String> lines = reader.readWithBufferedReader();
                lines.forEach(line -> System.out.println("   " + line));
                
                System.out.println("\n2. File Statistics:");
                Map<String, Object> stats = reader.getFileStatistics();
                stats.forEach((key, value) -> 
                    System.out.println("   " + key + ": " + value));
                
                System.out.println("\n3. Word Frequency:");
                Map<String, Long> wordFreq = reader.getWordFrequency();
                wordFreq.entrySet().stream()
                        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                        .limit(10)
                        .forEach(entry -> 
                            System.out.println("   " + entry.getKey() + ": " + entry.getValue()));
                
                System.out.println("\n4. Search for 'file':");
                List<String> searchResults = reader.searchPattern("file");
                searchResults.forEach(line -> System.out.println("   " + line));
                
                System.out.println("\n5. Entire file content:");
                System.out.println(reader.readEntireFile());
                
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
            
        } else {
            String filename = args[0];
            FileReaderUtil reader = new FileReaderUtil(filename);
            
            try {
                String operation = args.length > 1 ? args[1] : "read";
                
                switch (operation.toLowerCase()) {
                    case "read":
                        System.out.println("File content:");
                        reader.readWithBufferedReader().forEach(System.out::println);
                        break;
                        
                    case "stats":
                        Map<String, Object> stats = reader.getFileStatistics();
                        stats.forEach((key, value) -> 
                            System.out.println(key + ": " + value));
                        break;
                        
                    case "search":
                        if (args.length < 3) {
                            System.out.println("Please provide a search pattern!");
                            return;
                        }
                        String pattern = args[2];
                        List<String> results = reader.searchPattern(pattern);
                        if (results.isEmpty()) {
                            System.out.println("No matches found for '" + pattern + "'");
                        } else {
                            System.out.println("Found " + results.size() + " matches:");
                            results.forEach(System.out::println);
                        }
                        break;
                        
                    case "wordfreq":
                        Map<String, Long> freq = reader.getWordFrequency();
                        freq.entrySet().stream()
                                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                                .forEach(entry -> 
                                    System.out.println(entry.getKey() + ": " + entry.getValue()));
                        break;
                        
                    case "write":
                        if (args.length < 3) {
                            System.out.println("Please provide output filename!");
                            return;
                        }
                        String output = args[2];
                        String content = reader.readEntireFile();
                        reader.writeToFile(content, output);
                        break;
                        
                    default:
                        System.out.println("Unknown operation: " + operation);
                }
                
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
