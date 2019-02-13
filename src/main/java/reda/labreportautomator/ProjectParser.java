package reda.labreportautomator;

import java.util.ArrayList;
import java.util.List;

public class ProjectParser {
    public List<ProjectRecord> parse(List<String> lines) {
        List<ProjectRecord> records = new ArrayList<>();
        for (String line : lines) {
            if (line.startsWith("sample")) continue;
            String[] parts = line.split("\\t");
            if (parts.length >= 2) records.add(new ProjectRecord(parts[0], parts[1]));
        }
        return records;
    }
}
