import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class HashMapper implements Serializable
{
    private static final String PATH = "C:/Development/HashMap/HashMapper/data.txt";

    public void saveFile(HashMap<String, String> entries) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(PATH));
            os.writeObject(entries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, String> readFile()
       throws ClassNotFoundException, IOException
        {
            try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(PATH))) {
                return (HashMap<String, String>) is.readObject();
            }

    }

    public static void main(String[] args)
        throws Exception
    {
        HashMapper hash = new HashMapper();

        HashMap<String, String> Mapp = new HashMap<String, String>();
        Mapp.put("One Key", "One Value");
        Mapp.put("Two Key", "Two Value");

        for (Map.Entry<String,String> entry : Mapp.entrySet()){
            System.out.println("Key = " + entry.getKey() + " , value = " + entry.getValue());
        }

        hash.saveFile(Mapp);

        HashMap<String, String> restored = hash.readFile();

        System.out.println("SUCCESSFULLY LOADED FILE : " + restored);

    }


}