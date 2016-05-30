package com.nrhumla.mars;

import com.nrhumla.mars.commands.Command;

public class Rover {
    private Position position;

    public Rover(Position initialPosition) {
        position = initialPosition;
    }

    public Position process(Command command) {
        position = command.nextPosition(position);
        return position;
    }
}
