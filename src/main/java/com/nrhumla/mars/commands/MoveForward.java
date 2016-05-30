package com.nrhumla.mars.commands;

import com.nrhumla.mars.Orientation;
import com.nrhumla.mars.Position;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class MoveForward implements Command {

    private final Map<Orientation, UnaryOperator<Position>> moves;

    public MoveForward() {
        moves = new HashMap<>();
        moves.put(Orientation.NORTH, pos -> new Position(pos.getX(), pos.getY() + 1, pos.getOrientation()));
        moves.put(Orientation.SOUTH, pos -> new Position(pos.getX(), pos.getY() - 1, pos.getOrientation()));
        moves.put(Orientation.EAST, pos -> new Position(pos.getX() + 1, pos.getY(), pos.getOrientation()));
        moves.put(Orientation.WEST, pos -> new Position(pos.getX() - 1, pos.getY(), pos.getOrientation()));
    }

    @Override
    public Position nextPosition(Position position) {
        return moves.get(position.getOrientation()).apply(position);
    }
}
