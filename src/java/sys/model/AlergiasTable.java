/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ramses Mtnz Santiago
 */
@Entity
@Table(name = "alergias_medicamentos")
public class AlergiasTable {
 
    private int id,penicilina,barbituros,aspirina,sulfas,cortisona;
    
    public AlergiasTable(){
        
    }
    
    public AlergiasTable(int id,int penicilina,int barbituros,int aspirina,int sufas,int cortisona){
        this.aspirina=aspirina;
        this.barbituros=barbituros;
        this.cortisona=cortisona;
        this.id=id;
        this.penicilina=penicilina;
        this.sulfas=sufas;
    }

    /**
     * @return the sulfas
     */
    @Column(name = "sulfas")
    public int getSulfas() {
        return sulfas;
    }

    /**
     * @param sulfas the sulfas to set
     */
    public void setSulfas(int sulfas) {
        this.sulfas = sulfas;
    }

    /**
     * @return the cortisona
     */
    @Column(name = "cortisona")
    public int getCortisona() {
        return cortisona;
    }

    /**
     * @param cortisona the cortisona to set
     */
    public void setCortisona(int cortisona) {
        this.cortisona = cortisona;
    }

    /**
     * @return the id
     */
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the penicilina
     */
    @Column(name = "penicilina")
    public int getPenicilina() {
        return penicilina;
    }

    /**
     * @param penicilina the penicilina to set
     */
    public void setPenicilina(int penicilina) {
        this.penicilina = penicilina;
    }

    /**
     * @return the barbituros
     */
    @Column(name = "barbituros")
    public int getBarbituros() {
        return barbituros;
    }

    /**
     * @param barbituros the barbituros to set
     */
    public void setBarbituros(int barbituros) {
        this.barbituros = barbituros;
    }

    /**
     * @return the aspirina
     */
    @Column(name = "aspirina")
    public int getAspirina() {
        return aspirina;
    }

    /**
     * @param aspirina the aspirina to set
     */
    public void setAspirina(int aspirina) {
        this.aspirina = aspirina;
    }
}
