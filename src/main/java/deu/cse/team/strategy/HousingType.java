/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.strategy;

/**
 *
 * @author Yool
 */
public abstract class HousingType {
    protected WallBehavior WallBehavior;
    protected FloorBehavior FloorBehavior;
    protected CeilingBehavior CeilingBehavior;
    protected WindowBehavior WindowBehavior;
    protected int Height;
    protected int AFlatNumber;
    
    public abstract String display();
    
    public void PerformWall(){
        WallBehavior.WallConstruction();
    };
    
    public void PerformFloor(){
        FloorBehavior.FloorConstruction();
    };
    public void PerformCeiling(){
        CeilingBehavior.CeilingConstruction();
    };
    public void PerformWindow(){
        WindowBehavior.WindowConstruction();
    };
    
    public void SetWallBehavior(WallBehavior wb){
        WallBehavior = wb;
    };
 
    public void SetFloorBehavior(FloorBehavior fb){
        FloorBehavior = fb;
    };
    
    public void SetCeilingBehaivor(CeilingBehavior cb){
        CeilingBehavior = cb;    
    };
    
    public void SetWindowBehavior(WindowBehavior wnb){
        WindowBehavior = wnb;
    };
    
    public void SetHeight(int height){
        Height = height;
    };
    public void SetAFlatNumber(int aflatnumber){
        AFlatNumber = aflatnumber;
    };
    
    
}
