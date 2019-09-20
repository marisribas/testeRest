package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela FREELANCERS
 * @generated
 */
@Entity
@Table(name = "\"FREELANCERS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Freelancers")
public class Freelancers implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.String id;

  /**
  * @generated
  */
  @Column(name = "city", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String city;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "fk_usuario", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String fkUsuario;

  /**
  * @generated
  */
  @Column(name = "linkedin_url", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String linkedinUrl;

  /**
  * @generated
  */
  @Column(name = "name", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String name;

  /**
  * @generated
  */
  @Column(name = "profile", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String profile;

  /**
  * @generated
  */
  @Column(name = "resume", nullable = true, unique = false, length=2147483647, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] resume;

  /**
  * @generated
  */
  @Column(name = "uf", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String uf;

  /**
  * @generated
  */
  @Column(name = "weeklyhours", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer weeklyhours;

  /**
   * Construtor
   * @generated
   */
  public Freelancers(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Freelancers setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém city
   * return city
   * @generated
   */
  
  public java.lang.String getCity(){
    return this.city;
  }

  /**
   * Define city
   * @param city city
   * @generated
   */
  public Freelancers setCity(java.lang.String city){
    this.city = city;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public Freelancers setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém fkUsuario
   * return fkUsuario
   * @generated
   */
  
  public java.lang.String getFkUsuario(){
    return this.fkUsuario;
  }

  /**
   * Define fkUsuario
   * @param fkUsuario fkUsuario
   * @generated
   */
  public Freelancers setFkUsuario(java.lang.String fkUsuario){
    this.fkUsuario = fkUsuario;
    return this;
  }

  /**
   * Obtém linkedinUrl
   * return linkedinUrl
   * @generated
   */
  
  public java.lang.String getLinkedinUrl(){
    return this.linkedinUrl;
  }

  /**
   * Define linkedinUrl
   * @param linkedinUrl linkedinUrl
   * @generated
   */
  public Freelancers setLinkedinUrl(java.lang.String linkedinUrl){
    this.linkedinUrl = linkedinUrl;
    return this;
  }

  /**
   * Obtém name
   * return name
   * @generated
   */
  
  public java.lang.String getName(){
    return this.name;
  }

  /**
   * Define name
   * @param name name
   * @generated
   */
  public Freelancers setName(java.lang.String name){
    this.name = name;
    return this;
  }

  /**
   * Obtém profile
   * return profile
   * @generated
   */
  
  public java.lang.String getProfile(){
    return this.profile;
  }

  /**
   * Define profile
   * @param profile profile
   * @generated
   */
  public Freelancers setProfile(java.lang.String profile){
    this.profile = profile;
    return this;
  }

  /**
   * Obtém resume
   * return resume
   * @generated
   */
  
  public byte[] getResume(){
    return this.resume;
  }

  /**
   * Define resume
   * @param resume resume
   * @generated
   */
  public Freelancers setResume(byte[] resume){
    this.resume = resume;
    return this;
  }

  /**
   * Obtém uf
   * return uf
   * @generated
   */
  
  public java.lang.String getUf(){
    return this.uf;
  }

  /**
   * Define uf
   * @param uf uf
   * @generated
   */
  public Freelancers setUf(java.lang.String uf){
    this.uf = uf;
    return this;
  }

  /**
   * Obtém weeklyhours
   * return weeklyhours
   * @generated
   */
  
  public java.lang.Integer getWeeklyhours(){
    return this.weeklyhours;
  }

  /**
   * Define weeklyhours
   * @param weeklyhours weeklyhours
   * @generated
   */
  public Freelancers setWeeklyhours(java.lang.Integer weeklyhours){
    this.weeklyhours = weeklyhours;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Freelancers object = (Freelancers)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
