package demo_exam.utils;

import demo_exam.models.AccountLessor;
import demo_exam.models.AccountRenter;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFileLessor(List<AccountLessor> lessorList, String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false))) {
            for (AccountLessor lessor : lessorList) {
                bufferedWriter.write(lessor.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<AccountLessor> readFileLessor(String fileName) {
        List<AccountLessor> lessorList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(" ")) {
                    continue;
                }
                lessorList.add(new AccountLessor(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lessorList;
    }

    public static void writeFileRenter(List<AccountRenter> renterList, String filename) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, false))) {
            for (AccountRenter renter : renterList) {
                bufferedWriter.write(renter.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<AccountRenter> readFileRenter(String fileName) {
        List<AccountRenter> renterList = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                renterList.add(new AccountRenter(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return renterList;
    }
}
