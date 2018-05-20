/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;

/**
 *
 * @author polancou
 */
@Named(value = "vistaDientes")
@Dependent
public class VistaDientes {

    private String diente18;
    private String diente17;
    private String diente16;
    private String diente15;
    private String diente14;
    private String diente13;
    private String diente12;
    private String diente11;

    private String diente21;
    private String diente22;
    private String diente23;
    private String diente24;
    private String diente25;
    private String diente26;
    private String diente27;
    private String diente28;

    private String diente31;
    private String diente32;
    private String diente33;
    private String diente34;
    private String diente35;
    private String diente36;
    private String diente37;
    private String diente38;

    private String diente41;
    private String diente42;
    private String diente43;
    private String diente44;
    private String diente45;
    private String diente46;
    private String diente47;
    private String diente48;

    private String diente51;
    private String diente52;
    private String diente53;
    private String diente54;
    private String diente55;

    private String diente61;
    private String diente62;
    private String diente63;
    private String diente64;
    private String diente65;

    private String diente71;
    private String diente72;
    private String diente73;
    private String diente74;
    private String diente75;

    private String diente81;
    private String diente82;
    private String diente83;
    private String diente84;
    private String diente85;

    private String estado11;
    private String estado12;
    private String estado13;
    private String estado14;
    private String estado15;
    private String estado16;
    private String estado17;
    private String estado18;

    private String estado21;
    private String estado22;
    private String estado23;
    private String estado24;
    private String estado25;
    private String estado26;
    private String estado27;
    private String estado28;

    private String estado31;
    private String estado32;
    private String estado33;
    private String estado34;
    private String estado35;
    private String estado36;
    private String estado37;
    private String estado38;

    private String estado41;
    private String estado42;
    private String estado43;
    private String estado44;
    private String estado45;
    private String estado46;
    private String estado47;
    private String estado48;

    private String estado51;
    private String estado52;
    private String estado53;
    private String estado54;
    private String estado55;

    private String estado61;
    private String estado62;
    private String estado63;
    private String estado64;
    private String estado65;

    private String estado71;
    private String estado72;
    private String estado73;
    private String estado74;
    private String estado75;

    private String estado81;
    private String estado82;
    private String estado83;
    private String estado84;
    private String estado85;

    private String img11;
    private String img12;
    private String img13;
    private String img14;
    private String img15;
    private String img16;
    private String img17;
    private String img18;

    private String img21;
    private String img22;
    private String img23;
    private String img24;
    private String img25;
    private String img26;
    private String img27;
    private String img28;

    private String img31;
    private String img32;
    private String img33;
    private String img34;
    private String img35;
    private String img36;
    private String img37;
    private String img38;

    private String img41;
    private String img42;
    private String img43;
    private String img44;
    private String img45;
    private String img46;
    private String img47;
    private String img48;

    private String img51;
    private String img52;
    private String img53;
    private String img54;
    private String img55;

    private String img61;
    private String img62;
    private String img63;
    private String img64;
    private String img65;

    private String img71;
    private String img72;
    private String img73;
    private String img74;
    private String img75;

    private String img81;
    private String img82;
    private String img83;
    private String img84;
    private String img85;

    /**
     * Creates a new instance of VistaDientes
     */
    public VistaDientes() {
    }

    public void pruebas(){
        String diente= FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("diente"); 
        System.out.println("El diente es "+ diente);
        String estado= FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("estado"); 
        System.out.println("El estado es "+ estado);
        String img= FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("img"); 
        System.out.println("La ruta es "+ img);
    }
    /**
     * @return the diente18
     */
    public String getDiente18() {
        return diente18;
    }

    /**
     * @param diente18 the diente18 to set
     */
    public void setDiente18(String diente18) {
        this.diente18 = diente18;
    }

    /**
     * @return the diente17
     */
    public String getDiente17() {
        return diente17;
    }

    /**
     * @param diente17 the diente17 to set
     */
    public void setDiente17(String diente17) {
        this.diente17 = diente17;
    }

    /**
     * @return the diente16
     */
    public String getDiente16() {
        return diente16;
    }

    /**
     * @param diente16 the diente16 to set
     */
    public void setDiente16(String diente16) {
        this.diente16 = diente16;
    }

    /**
     * @return the diente15
     */
    public String getDiente15() {
        return diente15;
    }

    /**
     * @param diente15 the diente15 to set
     */
    public void setDiente15(String diente15) {
        this.diente15 = diente15;
    }

    /**
     * @return the diente14
     */
    public String getDiente14() {
        return diente14;
    }

    /**
     * @param diente14 the diente14 to set
     */
    public void setDiente14(String diente14) {
        this.diente14 = diente14;
    }

    /**
     * @return the diente13
     */
    public String getDiente13() {
        return diente13;
    }

    /**
     * @param diente13 the diente13 to set
     */
    public void setDiente13(String diente13) {
        this.diente13 = diente13;
    }

    /**
     * @return the diente12
     */
    public String getDiente12() {
        return diente12;
    }

    /**
     * @param diente12 the diente12 to set
     */
    public void setDiente12(String diente12) {
        this.diente12 = diente12;
    }

    /**
     * @return the diente11
     */
    public String getDiente11() {
        return diente11;
    }

    /**
     * @param diente11 the diente11 to set
     */
    public void setDiente11(String diente11) {
        this.diente11 = diente11;
    }

    /**
     * @return the diente21
     */
    public String getDiente21() {
        return diente21;
    }

    /**
     * @param diente21 the diente21 to set
     */
    public void setDiente21(String diente21) {
        this.diente21 = diente21;
    }

    /**
     * @return the diente22
     */
    public String getDiente22() {
        return diente22;
    }

    /**
     * @param diente22 the diente22 to set
     */
    public void setDiente22(String diente22) {
        this.diente22 = diente22;
    }

    /**
     * @return the diente23
     */
    public String getDiente23() {
        return diente23;
    }

    /**
     * @param diente23 the diente23 to set
     */
    public void setDiente23(String diente23) {
        this.diente23 = diente23;
    }

    /**
     * @return the diente24
     */
    public String getDiente24() {
        return diente24;
    }

    /**
     * @param diente24 the diente24 to set
     */
    public void setDiente24(String diente24) {
        this.diente24 = diente24;
    }

    /**
     * @return the diente25
     */
    public String getDiente25() {
        return diente25;
    }

    /**
     * @param diente25 the diente25 to set
     */
    public void setDiente25(String diente25) {
        this.diente25 = diente25;
    }

    /**
     * @return the diente26
     */
    public String getDiente26() {
        return diente26;
    }

    /**
     * @param diente26 the diente26 to set
     */
    public void setDiente26(String diente26) {
        this.diente26 = diente26;
    }

    /**
     * @return the diente27
     */
    public String getDiente27() {
        return diente27;
    }

    /**
     * @param diente27 the diente27 to set
     */
    public void setDiente27(String diente27) {
        this.diente27 = diente27;
    }

    /**
     * @return the diente28
     */
    public String getDiente28() {
        return diente28;
    }

    /**
     * @param diente28 the diente28 to set
     */
    public void setDiente28(String diente28) {
        this.diente28 = diente28;
    }

    /**
     * @return the diente31
     */
    public String getDiente31() {
        return diente31;
    }

    /**
     * @param diente31 the diente31 to set
     */
    public void setDiente31(String diente31) {
        this.diente31 = diente31;
    }

    /**
     * @return the diente32
     */
    public String getDiente32() {
        return diente32;
    }

    /**
     * @param diente32 the diente32 to set
     */
    public void setDiente32(String diente32) {
        this.diente32 = diente32;
    }

    /**
     * @return the diente33
     */
    public String getDiente33() {
        return diente33;
    }

    /**
     * @param diente33 the diente33 to set
     */
    public void setDiente33(String diente33) {
        this.diente33 = diente33;
    }

    /**
     * @return the diente34
     */
    public String getDiente34() {
        return diente34;
    }

    /**
     * @param diente34 the diente34 to set
     */
    public void setDiente34(String diente34) {
        this.diente34 = diente34;
    }

    /**
     * @return the diente35
     */
    public String getDiente35() {
        return diente35;
    }

    /**
     * @param diente35 the diente35 to set
     */
    public void setDiente35(String diente35) {
        this.diente35 = diente35;
    }

    /**
     * @return the diente36
     */
    public String getDiente36() {
        return diente36;
    }

    /**
     * @param diente36 the diente36 to set
     */
    public void setDiente36(String diente36) {
        this.diente36 = diente36;
    }

    /**
     * @return the diente37
     */
    public String getDiente37() {
        return diente37;
    }

    /**
     * @param diente37 the diente37 to set
     */
    public void setDiente37(String diente37) {
        this.diente37 = diente37;
    }

    /**
     * @return the diente38
     */
    public String getDiente38() {
        return diente38;
    }

    /**
     * @param diente38 the diente38 to set
     */
    public void setDiente38(String diente38) {
        this.diente38 = diente38;
    }

    /**
     * @return the diente41
     */
    public String getDiente41() {
        return diente41;
    }

    /**
     * @param diente41 the diente41 to set
     */
    public void setDiente41(String diente41) {
        this.diente41 = diente41;
    }

    /**
     * @return the diente42
     */
    public String getDiente42() {
        return diente42;
    }

    /**
     * @param diente42 the diente42 to set
     */
    public void setDiente42(String diente42) {
        this.diente42 = diente42;
    }

    /**
     * @return the diente43
     */
    public String getDiente43() {
        return diente43;
    }

    /**
     * @param diente43 the diente43 to set
     */
    public void setDiente43(String diente43) {
        this.diente43 = diente43;
    }

    /**
     * @return the diente44
     */
    public String getDiente44() {
        return diente44;
    }

    /**
     * @param diente44 the diente44 to set
     */
    public void setDiente44(String diente44) {
        this.diente44 = diente44;
    }

    /**
     * @return the diente45
     */
    public String getDiente45() {
        return diente45;
    }

    /**
     * @param diente45 the diente45 to set
     */
    public void setDiente45(String diente45) {
        this.diente45 = diente45;
    }

    /**
     * @return the diente46
     */
    public String getDiente46() {
        return diente46;
    }

    /**
     * @param diente46 the diente46 to set
     */
    public void setDiente46(String diente46) {
        this.diente46 = diente46;
    }

    /**
     * @return the diente47
     */
    public String getDiente47() {
        return diente47;
    }

    /**
     * @param diente47 the diente47 to set
     */
    public void setDiente47(String diente47) {
        this.diente47 = diente47;
    }

    /**
     * @return the diente48
     */
    public String getDiente48() {
        return diente48;
    }

    /**
     * @param diente48 the diente48 to set
     */
    public void setDiente48(String diente48) {
        this.diente48 = diente48;
    }

    /**
     * @return the diente51
     */
    public String getDiente51() {
        return diente51;
    }

    /**
     * @param diente51 the diente51 to set
     */
    public void setDiente51(String diente51) {
        this.diente51 = diente51;
    }

    /**
     * @return the diente52
     */
    public String getDiente52() {
        return diente52;
    }

    /**
     * @param diente52 the diente52 to set
     */
    public void setDiente52(String diente52) {
        this.diente52 = diente52;
    }

    /**
     * @return the diente53
     */
    public String getDiente53() {
        return diente53;
    }

    /**
     * @param diente53 the diente53 to set
     */
    public void setDiente53(String diente53) {
        this.diente53 = diente53;
    }

    /**
     * @return the diente54
     */
    public String getDiente54() {
        return diente54;
    }

    /**
     * @param diente54 the diente54 to set
     */
    public void setDiente54(String diente54) {
        this.diente54 = diente54;
    }

    /**
     * @return the diente55
     */
    public String getDiente55() {
        return diente55;
    }

    /**
     * @param diente55 the diente55 to set
     */
    public void setDiente55(String diente55) {
        this.diente55 = diente55;
    }

    /**
     * @return the diente61
     */
    public String getDiente61() {
        return diente61;
    }

    /**
     * @param diente61 the diente61 to set
     */
    public void setDiente61(String diente61) {
        this.diente61 = diente61;
    }

    /**
     * @return the diente62
     */
    public String getDiente62() {
        return diente62;
    }

    /**
     * @param diente62 the diente62 to set
     */
    public void setDiente62(String diente62) {
        this.diente62 = diente62;
    }

    /**
     * @return the diente63
     */
    public String getDiente63() {
        return diente63;
    }

    /**
     * @param diente63 the diente63 to set
     */
    public void setDiente63(String diente63) {
        this.diente63 = diente63;
    }

    /**
     * @return the diente64
     */
    public String getDiente64() {
        return diente64;
    }

    /**
     * @param diente64 the diente64 to set
     */
    public void setDiente64(String diente64) {
        this.diente64 = diente64;
    }

    /**
     * @return the diente65
     */
    public String getDiente65() {
        return diente65;
    }

    /**
     * @param diente65 the diente65 to set
     */
    public void setDiente65(String diente65) {
        this.diente65 = diente65;
    }

    /**
     * @return the diente71
     */
    public String getDiente71() {
        return diente71;
    }

    /**
     * @param diente71 the diente71 to set
     */
    public void setDiente71(String diente71) {
        this.diente71 = diente71;
    }

    /**
     * @return the diente72
     */
    public String getDiente72() {
        return diente72;
    }

    /**
     * @param diente72 the diente72 to set
     */
    public void setDiente72(String diente72) {
        this.diente72 = diente72;
    }

    /**
     * @return the diente73
     */
    public String getDiente73() {
        return diente73;
    }

    /**
     * @param diente73 the diente73 to set
     */
    public void setDiente73(String diente73) {
        this.diente73 = diente73;
    }

    /**
     * @return the diente74
     */
    public String getDiente74() {
        return diente74;
    }

    /**
     * @param diente74 the diente74 to set
     */
    public void setDiente74(String diente74) {
        this.diente74 = diente74;
    }

    /**
     * @return the diente75
     */
    public String getDiente75() {
        return diente75;
    }

    /**
     * @param diente75 the diente75 to set
     */
    public void setDiente75(String diente75) {
        this.diente75 = diente75;
    }

    /**
     * @return the diente81
     */
    public String getDiente81() {
        return diente81;
    }

    /**
     * @param diente81 the diente81 to set
     */
    public void setDiente81(String diente81) {
        this.diente81 = diente81;
    }

    /**
     * @return the diente82
     */
    public String getDiente82() {
        return diente82;
    }

    /**
     * @param diente82 the diente82 to set
     */
    public void setDiente82(String diente82) {
        this.diente82 = diente82;
    }

    /**
     * @return the diente83
     */
    public String getDiente83() {
        return diente83;
    }

    /**
     * @param diente83 the diente83 to set
     */
    public void setDiente83(String diente83) {
        this.diente83 = diente83;
    }

    /**
     * @return the diente84
     */
    public String getDiente84() {
        return diente84;
    }

    /**
     * @param diente84 the diente84 to set
     */
    public void setDiente84(String diente84) {
        this.diente84 = diente84;
    }

    /**
     * @return the diente85
     */
    public String getDiente85() {
        return diente85;
    }

    /**
     * @param diente85 the diente85 to set
     */
    public void setDiente85(String diente85) {
        this.diente85 = diente85;
    }

    /**
     * @return the estado11
     */
    public String getEstado11() {
        return estado11;
    }

    /**
     * @param estado11 the estado11 to set
     */
    public void setEstado11(String estado11) {
        this.estado11 = estado11;
    }

    /**
     * @return the estado12
     */
    public String getEstado12() {
        return estado12;
    }

    /**
     * @param estado12 the estado12 to set
     */
    public void setEstado12(String estado12) {
        this.estado12 = estado12;
    }

    /**
     * @return the estado13
     */
    public String getEstado13() {
        return estado13;
    }

    /**
     * @param estado13 the estado13 to set
     */
    public void setEstado13(String estado13) {
        this.estado13 = estado13;
    }

    /**
     * @return the estado14
     */
    public String getEstado14() {
        return estado14;
    }

    /**
     * @param estado14 the estado14 to set
     */
    public void setEstado14(String estado14) {
        this.estado14 = estado14;
    }

    /**
     * @return the estado15
     */
    public String getEstado15() {
        return estado15;
    }

    /**
     * @param estado15 the estado15 to set
     */
    public void setEstado15(String estado15) {
        this.estado15 = estado15;
    }

    /**
     * @return the estado16
     */
    public String getEstado16() {
        return estado16;
    }

    /**
     * @param estado16 the estado16 to set
     */
    public void setEstado16(String estado16) {
        this.estado16 = estado16;
    }

    /**
     * @return the estado17
     */
    public String getEstado17() {
        return estado17;
    }

    /**
     * @param estado17 the estado17 to set
     */
    public void setEstado17(String estado17) {
        this.estado17 = estado17;
    }

    /**
     * @return the estado18
     */
    public String getEstado18() {
        return estado18;
    }

    /**
     * @param estado18 the estado18 to set
     */
    public void setEstado18(String estado18) {
        this.estado18 = estado18;
    }

    /**
     * @return the estado21
     */
    public String getEstado21() {
        return estado21;
    }

    /**
     * @param estado21 the estado21 to set
     */
    public void setEstado21(String estado21) {
        this.estado21 = estado21;
    }

    /**
     * @return the estado22
     */
    public String getEstado22() {
        return estado22;
    }

    /**
     * @param estado22 the estado22 to set
     */
    public void setEstado22(String estado22) {
        this.estado22 = estado22;
    }

    /**
     * @return the estado23
     */
    public String getEstado23() {
        return estado23;
    }

    /**
     * @param estado23 the estado23 to set
     */
    public void setEstado23(String estado23) {
        this.estado23 = estado23;
    }

    /**
     * @return the estado24
     */
    public String getEstado24() {
        return estado24;
    }

    /**
     * @param estado24 the estado24 to set
     */
    public void setEstado24(String estado24) {
        this.estado24 = estado24;
    }

    /**
     * @return the estado25
     */
    public String getEstado25() {
        return estado25;
    }

    /**
     * @param estado25 the estado25 to set
     */
    public void setEstado25(String estado25) {
        this.estado25 = estado25;
    }

    /**
     * @return the estado26
     */
    public String getEstado26() {
        return estado26;
    }

    /**
     * @param estado26 the estado26 to set
     */
    public void setEstado26(String estado26) {
        this.estado26 = estado26;
    }

    /**
     * @return the estado27
     */
    public String getEstado27() {
        return estado27;
    }

    /**
     * @param estado27 the estado27 to set
     */
    public void setEstado27(String estado27) {
        this.estado27 = estado27;
    }

    /**
     * @return the estado28
     */
    public String getEstado28() {
        return estado28;
    }

    /**
     * @param estado28 the estado28 to set
     */
    public void setEstado28(String estado28) {
        this.estado28 = estado28;
    }

    /**
     * @return the estado31
     */
    public String getEstado31() {
        return estado31;
    }

    /**
     * @param estado31 the estado31 to set
     */
    public void setEstado31(String estado31) {
        this.estado31 = estado31;
    }

    /**
     * @return the estado32
     */
    public String getEstado32() {
        return estado32;
    }

    /**
     * @param estado32 the estado32 to set
     */
    public void setEstado32(String estado32) {
        this.estado32 = estado32;
    }

    /**
     * @return the estado33
     */
    public String getEstado33() {
        return estado33;
    }

    /**
     * @param estado33 the estado33 to set
     */
    public void setEstado33(String estado33) {
        this.estado33 = estado33;
    }

    /**
     * @return the estado34
     */
    public String getEstado34() {
        return estado34;
    }

    /**
     * @param estado34 the estado34 to set
     */
    public void setEstado34(String estado34) {
        this.estado34 = estado34;
    }

    /**
     * @return the estado35
     */
    public String getEstado35() {
        return estado35;
    }

    /**
     * @param estado35 the estado35 to set
     */
    public void setEstado35(String estado35) {
        this.estado35 = estado35;
    }

    /**
     * @return the estado36
     */
    public String getEstado36() {
        return estado36;
    }

    /**
     * @param estado36 the estado36 to set
     */
    public void setEstado36(String estado36) {
        this.estado36 = estado36;
    }

    /**
     * @return the estado37
     */
    public String getEstado37() {
        return estado37;
    }

    /**
     * @param estado37 the estado37 to set
     */
    public void setEstado37(String estado37) {
        this.estado37 = estado37;
    }

    /**
     * @return the estado38
     */
    public String getEstado38() {
        return estado38;
    }

    /**
     * @param estado38 the estado38 to set
     */
    public void setEstado38(String estado38) {
        this.estado38 = estado38;
    }

    /**
     * @return the estado41
     */
    public String getEstado41() {
        return estado41;
    }

    /**
     * @param estado41 the estado41 to set
     */
    public void setEstado41(String estado41) {
        this.estado41 = estado41;
    }

    /**
     * @return the estado42
     */
    public String getEstado42() {
        return estado42;
    }

    /**
     * @param estado42 the estado42 to set
     */
    public void setEstado42(String estado42) {
        this.estado42 = estado42;
    }

    /**
     * @return the estado43
     */
    public String getEstado43() {
        return estado43;
    }

    /**
     * @param estado43 the estado43 to set
     */
    public void setEstado43(String estado43) {
        this.estado43 = estado43;
    }

    /**
     * @return the estado44
     */
    public String getEstado44() {
        return estado44;
    }

    /**
     * @param estado44 the estado44 to set
     */
    public void setEstado44(String estado44) {
        this.estado44 = estado44;
    }

    /**
     * @return the estado45
     */
    public String getEstado45() {
        return estado45;
    }

    /**
     * @param estado45 the estado45 to set
     */
    public void setEstado45(String estado45) {
        this.estado45 = estado45;
    }

    /**
     * @return the estado46
     */
    public String getEstado46() {
        return estado46;
    }

    /**
     * @param estado46 the estado46 to set
     */
    public void setEstado46(String estado46) {
        this.estado46 = estado46;
    }

    /**
     * @return the estado47
     */
    public String getEstado47() {
        return estado47;
    }

    /**
     * @param estado47 the estado47 to set
     */
    public void setEstado47(String estado47) {
        this.estado47 = estado47;
    }

    /**
     * @return the estado48
     */
    public String getEstado48() {
        return estado48;
    }

    /**
     * @param estado48 the estado48 to set
     */
    public void setEstado48(String estado48) {
        this.estado48 = estado48;
    }

    /**
     * @return the estado51
     */
    public String getEstado51() {
        return estado51;
    }

    /**
     * @param estado51 the estado51 to set
     */
    public void setEstado51(String estado51) {
        this.estado51 = estado51;
    }

    /**
     * @return the estado52
     */
    public String getEstado52() {
        return estado52;
    }

    /**
     * @param estado52 the estado52 to set
     */
    public void setEstado52(String estado52) {
        this.estado52 = estado52;
    }

    /**
     * @return the estado53
     */
    public String getEstado53() {
        return estado53;
    }

    /**
     * @param estado53 the estado53 to set
     */
    public void setEstado53(String estado53) {
        this.estado53 = estado53;
    }

    /**
     * @return the estado54
     */
    public String getEstado54() {
        return estado54;
    }

    /**
     * @param estado54 the estado54 to set
     */
    public void setEstado54(String estado54) {
        this.estado54 = estado54;
    }

    /**
     * @return the estado55
     */
    public String getEstado55() {
        return estado55;
    }

    /**
     * @param estado55 the estado55 to set
     */
    public void setEstado55(String estado55) {
        this.estado55 = estado55;
    }

    /**
     * @return the estado61
     */
    public String getEstado61() {
        return estado61;
    }

    /**
     * @param estado61 the estado61 to set
     */
    public void setEstado61(String estado61) {
        this.estado61 = estado61;
    }

    /**
     * @return the estado62
     */
    public String getEstado62() {
        return estado62;
    }

    /**
     * @param estado62 the estado62 to set
     */
    public void setEstado62(String estado62) {
        this.estado62 = estado62;
    }

    /**
     * @return the estado63
     */
    public String getEstado63() {
        return estado63;
    }

    /**
     * @param estado63 the estado63 to set
     */
    public void setEstado63(String estado63) {
        this.estado63 = estado63;
    }

    /**
     * @return the estado64
     */
    public String getEstado64() {
        return estado64;
    }

    /**
     * @param estado64 the estado64 to set
     */
    public void setEstado64(String estado64) {
        this.estado64 = estado64;
    }

    /**
     * @return the estado65
     */
    public String getEstado65() {
        return estado65;
    }

    /**
     * @param estado65 the estado65 to set
     */
    public void setEstado65(String estado65) {
        this.estado65 = estado65;
    }

    /**
     * @return the estado71
     */
    public String getEstado71() {
        return estado71;
    }

    /**
     * @param estado71 the estado71 to set
     */
    public void setEstado71(String estado71) {
        this.estado71 = estado71;
    }

    /**
     * @return the estado72
     */
    public String getEstado72() {
        return estado72;
    }

    /**
     * @param estado72 the estado72 to set
     */
    public void setEstado72(String estado72) {
        this.estado72 = estado72;
    }

    /**
     * @return the estado73
     */
    public String getEstado73() {
        return estado73;
    }

    /**
     * @param estado73 the estado73 to set
     */
    public void setEstado73(String estado73) {
        this.estado73 = estado73;
    }

    /**
     * @return the estado74
     */
    public String getEstado74() {
        return estado74;
    }

    /**
     * @param estado74 the estado74 to set
     */
    public void setEstado74(String estado74) {
        this.estado74 = estado74;
    }

    /**
     * @return the estado75
     */
    public String getEstado75() {
        return estado75;
    }

    /**
     * @param estado75 the estado75 to set
     */
    public void setEstado75(String estado75) {
        this.estado75 = estado75;
    }

    /**
     * @return the estado81
     */
    public String getEstado81() {
        return estado81;
    }

    /**
     * @param estado81 the estado81 to set
     */
    public void setEstado81(String estado81) {
        this.estado81 = estado81;
    }

    /**
     * @return the estado82
     */
    public String getEstado82() {
        return estado82;
    }

    /**
     * @param estado82 the estado82 to set
     */
    public void setEstado82(String estado82) {
        this.estado82 = estado82;
    }

    /**
     * @return the estado83
     */
    public String getEstado83() {
        return estado83;
    }

    /**
     * @param estado83 the estado83 to set
     */
    public void setEstado83(String estado83) {
        this.estado83 = estado83;
    }

    /**
     * @return the estado84
     */
    public String getEstado84() {
        return estado84;
    }

    /**
     * @param estado84 the estado84 to set
     */
    public void setEstado84(String estado84) {
        this.estado84 = estado84;
    }

    /**
     * @return the estado85
     */
    public String getEstado85() {
        return estado85;
    }

    /**
     * @param estado85 the estado85 to set
     */
    public void setEstado85(String estado85) {
        this.estado85 = estado85;
    }

    /**
     * @return the img11
     */
    public String getImg11() {
        return img11;
    }

    /**
     * @param img11 the img11 to set
     */
    public void setImg11(String img11) {
        this.img11 = img11;
    }

    /**
     * @return the img12
     */
    public String getImg12() {
        return img12;
    }

    /**
     * @param img12 the img12 to set
     */
    public void setImg12(String img12) {
        this.img12 = img12;
    }

    /**
     * @return the img13
     */
    public String getImg13() {
        return img13;
    }

    /**
     * @param img13 the img13 to set
     */
    public void setImg13(String img13) {
        this.img13 = img13;
    }

    /**
     * @return the img14
     */
    public String getImg14() {
        return img14;
    }

    /**
     * @param img14 the img14 to set
     */
    public void setImg14(String img14) {
        this.img14 = img14;
    }

    /**
     * @return the img15
     */
    public String getImg15() {
        return img15;
    }

    /**
     * @param img15 the img15 to set
     */
    public void setImg15(String img15) {
        this.img15 = img15;
    }

    /**
     * @return the img16
     */
    public String getImg16() {
        return img16;
    }

    /**
     * @param img16 the img16 to set
     */
    public void setImg16(String img16) {
        this.img16 = img16;
    }

    /**
     * @return the img17
     */
    public String getImg17() {
        return img17;
    }

    /**
     * @param img17 the img17 to set
     */
    public void setImg17(String img17) {
        this.img17 = img17;
    }

    /**
     * @return the img18
     */
    public String getImg18() {
        return img18;
    }

    /**
     * @param img18 the img18 to set
     */
    public void setImg18(String img18) {
        this.img18 = img18;
    }

    /**
     * @return the img21
     */
    public String getImg21() {
        return img21;
    }

    /**
     * @param img21 the img21 to set
     */
    public void setImg21(String img21) {
        this.img21 = img21;
    }

    /**
     * @return the img22
     */
    public String getImg22() {
        return img22;
    }

    /**
     * @param img22 the img22 to set
     */
    public void setImg22(String img22) {
        this.img22 = img22;
    }

    /**
     * @return the img23
     */
    public String getImg23() {
        return img23;
    }

    /**
     * @param img23 the img23 to set
     */
    public void setImg23(String img23) {
        this.img23 = img23;
    }

    /**
     * @return the img24
     */
    public String getImg24() {
        return img24;
    }

    /**
     * @param img24 the img24 to set
     */
    public void setImg24(String img24) {
        this.img24 = img24;
    }

    /**
     * @return the img25
     */
    public String getImg25() {
        return img25;
    }

    /**
     * @param img25 the img25 to set
     */
    public void setImg25(String img25) {
        this.img25 = img25;
    }

    /**
     * @return the img26
     */
    public String getImg26() {
        return img26;
    }

    /**
     * @param img26 the img26 to set
     */
    public void setImg26(String img26) {
        this.img26 = img26;
    }

    /**
     * @return the img27
     */
    public String getImg27() {
        return img27;
    }

    /**
     * @param img27 the img27 to set
     */
    public void setImg27(String img27) {
        this.img27 = img27;
    }

    /**
     * @return the img28
     */
    public String getImg28() {
        return img28;
    }

    /**
     * @param img28 the img28 to set
     */
    public void setImg28(String img28) {
        this.img28 = img28;
    }

    /**
     * @return the img31
     */
    public String getImg31() {
        return img31;
    }

    /**
     * @param img31 the img31 to set
     */
    public void setImg31(String img31) {
        this.img31 = img31;
    }

    /**
     * @return the img32
     */
    public String getImg32() {
        return img32;
    }

    /**
     * @param img32 the img32 to set
     */
    public void setImg32(String img32) {
        this.img32 = img32;
    }

    /**
     * @return the img33
     */
    public String getImg33() {
        return img33;
    }

    /**
     * @param img33 the img33 to set
     */
    public void setImg33(String img33) {
        this.img33 = img33;
    }

    /**
     * @return the img34
     */
    public String getImg34() {
        return img34;
    }

    /**
     * @param img34 the img34 to set
     */
    public void setImg34(String img34) {
        this.img34 = img34;
    }

    /**
     * @return the img35
     */
    public String getImg35() {
        return img35;
    }

    /**
     * @param img35 the img35 to set
     */
    public void setImg35(String img35) {
        this.img35 = img35;
    }

    /**
     * @return the img36
     */
    public String getImg36() {
        return img36;
    }

    /**
     * @param img36 the img36 to set
     */
    public void setImg36(String img36) {
        this.img36 = img36;
    }

    /**
     * @return the img37
     */
    public String getImg37() {
        return img37;
    }

    /**
     * @param img37 the img37 to set
     */
    public void setImg37(String img37) {
        this.img37 = img37;
    }

    /**
     * @return the img38
     */
    public String getImg38() {
        return img38;
    }

    /**
     * @param img38 the img38 to set
     */
    public void setImg38(String img38) {
        this.img38 = img38;
    }

    /**
     * @return the img41
     */
    public String getImg41() {
        return img41;
    }

    /**
     * @param img41 the img41 to set
     */
    public void setImg41(String img41) {
        this.img41 = img41;
    }

    /**
     * @return the img42
     */
    public String getImg42() {
        return img42;
    }

    /**
     * @param img42 the img42 to set
     */
    public void setImg42(String img42) {
        this.img42 = img42;
    }

    /**
     * @return the img43
     */
    public String getImg43() {
        return img43;
    }

    /**
     * @param img43 the img43 to set
     */
    public void setImg43(String img43) {
        this.img43 = img43;
    }

    /**
     * @return the img44
     */
    public String getImg44() {
        return img44;
    }

    /**
     * @param img44 the img44 to set
     */
    public void setImg44(String img44) {
        this.img44 = img44;
    }

    /**
     * @return the img45
     */
    public String getImg45() {
        return img45;
    }

    /**
     * @param img45 the img45 to set
     */
    public void setImg45(String img45) {
        this.img45 = img45;
    }

    /**
     * @return the img46
     */
    public String getImg46() {
        return img46;
    }

    /**
     * @param img46 the img46 to set
     */
    public void setImg46(String img46) {
        this.img46 = img46;
    }

    /**
     * @return the img47
     */
    public String getImg47() {
        return img47;
    }

    /**
     * @param img47 the img47 to set
     */
    public void setImg47(String img47) {
        this.img47 = img47;
    }

    /**
     * @return the img48
     */
    public String getImg48() {
        return img48;
    }

    /**
     * @param img48 the img48 to set
     */
    public void setImg48(String img48) {
        this.img48 = img48;
    }

    /**
     * @return the img51
     */
    public String getImg51() {
        return img51;
    }

    /**
     * @param img51 the img51 to set
     */
    public void setImg51(String img51) {
        this.img51 = img51;
    }

    /**
     * @return the img52
     */
    public String getImg52() {
        return img52;
    }

    /**
     * @param img52 the img52 to set
     */
    public void setImg52(String img52) {
        this.img52 = img52;
    }

    /**
     * @return the img53
     */
    public String getImg53() {
        return img53;
    }

    /**
     * @param img53 the img53 to set
     */
    public void setImg53(String img53) {
        this.img53 = img53;
    }

    /**
     * @return the img54
     */
    public String getImg54() {
        return img54;
    }

    /**
     * @param img54 the img54 to set
     */
    public void setImg54(String img54) {
        this.img54 = img54;
    }

    /**
     * @return the img55
     */
    public String getImg55() {
        return img55;
    }

    /**
     * @param img55 the img55 to set
     */
    public void setImg55(String img55) {
        this.img55 = img55;
    }

    /**
     * @return the img61
     */
    public String getImg61() {
        return img61;
    }

    /**
     * @param img61 the img61 to set
     */
    public void setImg61(String img61) {
        this.img61 = img61;
    }

    /**
     * @return the img62
     */
    public String getImg62() {
        return img62;
    }

    /**
     * @param img62 the img62 to set
     */
    public void setImg62(String img62) {
        this.img62 = img62;
    }

    /**
     * @return the img63
     */
    public String getImg63() {
        return img63;
    }

    /**
     * @param img63 the img63 to set
     */
    public void setImg63(String img63) {
        this.img63 = img63;
    }

    /**
     * @return the img64
     */
    public String getImg64() {
        return img64;
    }

    /**
     * @param img64 the img64 to set
     */
    public void setImg64(String img64) {
        this.img64 = img64;
    }

    /**
     * @return the img65
     */
    public String getImg65() {
        return img65;
    }

    /**
     * @param img65 the img65 to set
     */
    public void setImg65(String img65) {
        this.img65 = img65;
    }

    /**
     * @return the img71
     */
    public String getImg71() {
        return img71;
    }

    /**
     * @param img71 the img71 to set
     */
    public void setImg71(String img71) {
        this.img71 = img71;
    }

    /**
     * @return the img72
     */
    public String getImg72() {
        return img72;
    }

    /**
     * @param img72 the img72 to set
     */
    public void setImg72(String img72) {
        this.img72 = img72;
    }

    /**
     * @return the img73
     */
    public String getImg73() {
        return img73;
    }

    /**
     * @param img73 the img73 to set
     */
    public void setImg73(String img73) {
        this.img73 = img73;
    }

    /**
     * @return the img74
     */
    public String getImg74() {
        return img74;
    }

    /**
     * @param img74 the img74 to set
     */
    public void setImg74(String img74) {
        this.img74 = img74;
    }

    /**
     * @return the img75
     */
    public String getImg75() {
        return img75;
    }

    /**
     * @param img75 the img75 to set
     */
    public void setImg75(String img75) {
        this.img75 = img75;
    }

    /**
     * @return the img81
     */
    public String getImg81() {
        return img81;
    }

    /**
     * @param img81 the img81 to set
     */
    public void setImg81(String img81) {
        this.img81 = img81;
    }

    /**
     * @return the img82
     */
    public String getImg82() {
        return img82;
    }

    /**
     * @param img82 the img82 to set
     */
    public void setImg82(String img82) {
        this.img82 = img82;
    }

    /**
     * @return the img83
     */
    public String getImg83() {
        return img83;
    }

    /**
     * @param img83 the img83 to set
     */
    public void setImg83(String img83) {
        this.img83 = img83;
    }

    /**
     * @return the img84
     */
    public String getImg84() {
        return img84;
    }

    /**
     * @param img84 the img84 to set
     */
    public void setImg84(String img84) {
        this.img84 = img84;
    }

    /**
     * @return the img85
     */
    public String getImg85() {
        return img85;
    }

    /**
     * @param img85 the img85 to set
     */
    public void setImg85(String img85) {
        this.img85 = img85;
    }

}
