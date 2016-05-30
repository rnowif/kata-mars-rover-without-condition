package com.nrhumla.mars;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class OrientationTest {

    @Test
    public void should_have_east_as_right_when_north() {
        assertThat(Orientation.NORTH.right()).isEqualTo(Orientation.EAST);
    }

    @Test
    public void should_have_west_as_right_when_south() {
        assertThat(Orientation.SOUTH.right()).isEqualTo(Orientation.WEST);
    }

    @Test
    public void should_have_south_as_right_when_east() {
        assertThat(Orientation.EAST.right()).isEqualTo(Orientation.SOUTH);
    }

    @Test
    public void should_have_north_as_right_when_west() {
        assertThat(Orientation.WEST.right()).isEqualTo(Orientation.NORTH);
    }

    @Test
    public void should_have_west_as_left_when_north() {
        assertThat(Orientation.NORTH.left()).isEqualTo(Orientation.WEST);
    }

    @Test
    public void should_have_east_as_left_when_south() {
        assertThat(Orientation.SOUTH.left()).isEqualTo(Orientation.EAST);
    }

    @Test
    public void should_have_north_as_left_when_east() {
        assertThat(Orientation.EAST.left()).isEqualTo(Orientation.NORTH);
    }

    @Test
    public void should_have_south_as_left_when_west() {
        assertThat(Orientation.WEST.left()).isEqualTo(Orientation.SOUTH);
    }

}