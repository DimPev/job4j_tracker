package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double avg = 0;
        int amount = 0;
        for (Pupil pupil : pupils) {
            for (Subject pup : pupil.subjects()) {
                avg += pup.score();
                amount++;
            }
        }
        return avg / amount;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            int amount = 0;
            for (Subject pup : pupil.subjects()) {
                score += pup.score();
                amount++;
            }
            double averageScore = score / amount;
            labels.add(new Label(pupil.name(), averageScore));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> scoreMap = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject pup : pupil.subjects()) {
                scoreMap.merge(pup.name(), pup.score(), Integer::sum);
            }
        }
        List<Label> result = new ArrayList<>();
        int amount = pupils.size();
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            String subjectName = entry.getKey();
            double averageScore = entry.getValue() / (double) amount;
            result.add(new Label(subjectName, averageScore));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pup : pupils) {
            double score = 0;
            for (Subject subject : pup.subjects()) {
                score += subject.score();
            }
            labels.add(new Label(pup.name(), score));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Double> subjectScores = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject pup : pupil.subjects()) {
                subjectScores.merge(pup.name(), (double) pup.score(), Double::sum);
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Double> entry : subjectScores.entrySet()) {
            labels.add(new Label(entry.getKey(), entry.getValue()));
        }
        labels.sort(Comparator.reverseOrder());
        return labels.get(0);
    }
}
