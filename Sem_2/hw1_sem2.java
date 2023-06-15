// 1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


package Sem_2;

public class hw1_sem2 {
    public static void main(String[] args) throws Exception {
        
        String jStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        // System.out.println(jStr);
        StringBuilder sb = new StringBuilder();
        String fStr="select * from students where ";
        sb.append(fStr);

        jStr=jStr.replace("{", "");
        jStr=jStr.replace("}", "");

        String[] parts = jStr.split(",");

        for (int i=0; i<parts.length; i++){
            String[] subParts = parts[i].trim().split(":");
            
            sb.append(subParts[0].substring(1, subParts[0].length()-1));
            sb.append(" = ");
            sb.append(subParts[1]);
            if (i != parts.length-1 ) {
                sb.append(" & ");
            }
        }
        
        System.out.println(sb);
    }
    
}
