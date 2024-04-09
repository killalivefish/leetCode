package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

//TODO notpass
public class ThroneInheritance {
    
    private Man king;
    
    public ThroneInheritance(String kingName) {
        Man curKing = new Man();
        curKing.setKing(true);
        curKing.setName(kingName);
        this.king = curKing;
    }
    
    public void birth(String parentName, String childName) {
        Man parent = findManByName(parentName);
        if (parent != null) {
            Man curChild = new Man();
            curChild.setName(childName);
            parent.getCurOrder().add(curChild);
        }
    }
    
    public void death(String name) {
        Man curMan = findManByName(name);
        if (curMan != null) {
            curMan.setDead(true);
        }
    }
    
    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        order(this.king, result);
        
        return result;
    }
    
    private Man findManByName(String name) {
        Man result = null;
        if (this.king.name.equals(name)) {
            return this.king;
        } else {
            for (Man man : this.king.getCurOrder()) {
                if (man.getName().equals(name)) {
                    return man;
                } else {
                    result = findManByName(man.getName());
                }
            }
        }
        
        return result;
    }
    
    private void order(Man man, List<String> result) {
        if (man != null && man.isDead() == false) {
            result.add(man.getName());
        }
        
        for (Man curMan : man.getCurOrder()) {
            order(curMan, result);
        }
    }
    
    private class Man {
        
        private String name;
        
        private boolean dead = false;
        
        private boolean king = false;
        
        private List<Man> curOrder = new ArrayList<>(10);
        
        public Man() {
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public boolean isDead() {
            return dead;
        }
        
        public void setDead(boolean dead) {
            this.dead = dead;
        }
        
        public boolean isKing() {
            return king;
        }
        
        public void setKing(boolean king) {
            this.king = king;
        }
        
        public List<Man> getCurOrder() {
            return curOrder;
        }
        
        public void setCurOrder(List<Man> curOrder) {
            this.curOrder = curOrder;
        }
    }
}
