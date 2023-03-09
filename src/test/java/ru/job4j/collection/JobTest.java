package ru.job4j.collection;


import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;


public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByName() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Ampl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorByReverseNameProrityReverse() {
        Comparator<Job> cmpNamePriority = new JobReverseByName().thenComparing(new JobReverseByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Ampl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorReverseByName() {
        Comparator<Job> cmpNamePriority = new JobReverseByName();
        int rsl = cmpNamePriority.compare(
                new Job("Ampl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorReverseByPriority() {
        Comparator<Job> cmpNamePriority = new JobReverseByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Ampl task", 5),
                new Job("AAAAA", 7)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorReversByNamePrority() {
        Comparator<Job> cmpNamePriority = new JobReverseByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("ZZZ", 0),
                new Job("Standd", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }
}
