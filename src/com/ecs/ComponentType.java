package com.ecs;

public enum ComponentType {

    RENDERABLE(0),
    COLLIDER(1),
    PHYSICS_BODY(2)
    ;

    private final int index;

    ComponentType(int _index){
        this.index = _index;
    }

    public int getComponentIndex(){
        return this.index;
    }

}
