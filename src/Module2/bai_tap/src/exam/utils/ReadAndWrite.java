package exam.utils;

import demo_exam.models.AccountLessor;
import exam.model.DvOTO;
import exam.model.DvXeTai;
import exam.model.OTo;
import exam.model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<OTo> readFileMaOto(String fileName) {
        List<OTo> oTos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                oTos.add(new OTo(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return oTos;
    }
    public static List<XeTai> readFileMaXeTai(String fileName) {
        List<XeTai> xeTais = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                xeTais.add(new XeTai(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xeTais;
    }

    public static void writeFileOto(List<DvOTO> oTos, String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false))) {
            for (DvOTO oTo : oTos) {
                bufferedWriter.write(oTo.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<DvOTO> readFileOto(String fileName) {
        List<DvOTO> oTos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(" ")) {
                    continue;
                }
                oTos.add(new DvOTO(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return oTos;
    }
    public static void writeFileXeTai(List<DvXeTai> xeTais, String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false))) {
            for (DvXeTai xeTai : xeTais) {
                bufferedWriter.write(xeTai.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<DvXeTai> readFileXeTai(String fileName) {
        List<DvXeTai> dvXeTais = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(" ")) {
                    continue;
                }
                dvXeTais.add(new DvXeTai(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dvXeTais;
    }
}
