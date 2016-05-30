package com.nrhumla.mars.commands;

import com.nrhumla.mars.Position;

public class RotateRight implements Command {

    @Override
    public Position nextPosition(Position position) {
        return new Position(position.getX(), position.getY(), position.getOrientation().right());
    }
}
