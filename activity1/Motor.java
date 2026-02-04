
public class Motor {
    String brand;
    String version;
    int model;
    int cc;
    char capacity;
    String condition;

    void printDetails(){
        System.out.printf("""
            %s %s %d
                
                """,brand,version,cc );
    }
}
