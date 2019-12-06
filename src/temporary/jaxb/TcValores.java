//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.06 at 06:42:00 PM BRST 
//


package temporary.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tcValores complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcValores">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValorServicos" type="{}tsValor"/>
 *         &lt;element name="ValorDeducoes" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorPis" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorCofins" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorInss" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorIr" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorCsll" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="IssRetido" type="{}tsSimNao"/>
 *         &lt;element name="ValorIss" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorIssRetido" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="OutrasRetencoes" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="BaseCalculo" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="Aliquota" type="{}tsAliquota" minOccurs="0"/>
 *         &lt;element name="ValorLiquidoNfse" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="DescontoIncondicionado" type="{}tsValor" minOccurs="0"/>
 *         &lt;element name="DescontoCondicionado" type="{}tsValor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcValores", propOrder = {
    "valorServicos",
    "valorDeducoes",
    "valorPis",
    "valorCofins",
    "valorInss",
    "valorIr",
    "valorCsll",
    "issRetido",
    "valorIss",
    "valorIssRetido",
    "outrasRetencoes",
    "baseCalculo",
    "aliquota",
    "valorLiquidoNfse",
    "descontoIncondicionado",
    "descontoCondicionado"
})
public class TcValores {

    @XmlElement(name = "ValorServicos", required = true)
    protected BigDecimal valorServicos;
    @XmlElement(name = "ValorDeducoes")
    protected BigDecimal valorDeducoes;
    @XmlElement(name = "ValorPis")
    protected BigDecimal valorPis;
    @XmlElement(name = "ValorCofins")
    protected BigDecimal valorCofins;
    @XmlElement(name = "ValorInss")
    protected BigDecimal valorInss;
    @XmlElement(name = "ValorIr")
    protected BigDecimal valorIr;
    @XmlElement(name = "ValorCsll")
    protected BigDecimal valorCsll;
    @XmlElement(name = "IssRetido")
    protected byte issRetido;
    @XmlElement(name = "ValorIss")
    protected BigDecimal valorIss;
    @XmlElement(name = "ValorIssRetido")
    protected BigDecimal valorIssRetido;
    @XmlElement(name = "OutrasRetencoes")
    protected BigDecimal outrasRetencoes;
    @XmlElement(name = "BaseCalculo")
    protected BigDecimal baseCalculo;
    @XmlElement(name = "Aliquota")
    protected BigDecimal aliquota;
    @XmlElement(name = "ValorLiquidoNfse")
    protected BigDecimal valorLiquidoNfse;
    @XmlElement(name = "DescontoIncondicionado")
    protected BigDecimal descontoIncondicionado;
    @XmlElement(name = "DescontoCondicionado")
    protected BigDecimal descontoCondicionado;

    /**
     * Gets the value of the valorServicos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorServicos() {
        return valorServicos;
    }

    /**
     * Sets the value of the valorServicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorServicos(BigDecimal value) {
        this.valorServicos = value;
    }

    /**
     * Gets the value of the valorDeducoes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDeducoes() {
        return valorDeducoes;
    }

    /**
     * Sets the value of the valorDeducoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDeducoes(BigDecimal value) {
        this.valorDeducoes = value;
    }

    /**
     * Gets the value of the valorPis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPis() {
        return valorPis;
    }

    /**
     * Sets the value of the valorPis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPis(BigDecimal value) {
        this.valorPis = value;
    }

    /**
     * Gets the value of the valorCofins property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCofins() {
        return valorCofins;
    }

    /**
     * Sets the value of the valorCofins property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCofins(BigDecimal value) {
        this.valorCofins = value;
    }

    /**
     * Gets the value of the valorInss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorInss() {
        return valorInss;
    }

    /**
     * Sets the value of the valorInss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorInss(BigDecimal value) {
        this.valorInss = value;
    }

    /**
     * Gets the value of the valorIr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIr() {
        return valorIr;
    }

    /**
     * Sets the value of the valorIr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIr(BigDecimal value) {
        this.valorIr = value;
    }

    /**
     * Gets the value of the valorCsll property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCsll() {
        return valorCsll;
    }

    /**
     * Sets the value of the valorCsll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCsll(BigDecimal value) {
        this.valorCsll = value;
    }

    /**
     * Gets the value of the issRetido property.
     * 
     */
    public byte getIssRetido() {
        return issRetido;
    }

    /**
     * Sets the value of the issRetido property.
     * 
     */
    public void setIssRetido(byte value) {
        this.issRetido = value;
    }

    /**
     * Gets the value of the valorIss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIss() {
        return valorIss;
    }

    /**
     * Sets the value of the valorIss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIss(BigDecimal value) {
        this.valorIss = value;
    }

    /**
     * Gets the value of the valorIssRetido property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIssRetido() {
        return valorIssRetido;
    }

    /**
     * Sets the value of the valorIssRetido property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIssRetido(BigDecimal value) {
        this.valorIssRetido = value;
    }

    /**
     * Gets the value of the outrasRetencoes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutrasRetencoes() {
        return outrasRetencoes;
    }

    /**
     * Sets the value of the outrasRetencoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutrasRetencoes(BigDecimal value) {
        this.outrasRetencoes = value;
    }

    /**
     * Gets the value of the baseCalculo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseCalculo() {
        return baseCalculo;
    }

    /**
     * Sets the value of the baseCalculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseCalculo(BigDecimal value) {
        this.baseCalculo = value;
    }

    /**
     * Gets the value of the aliquota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquota() {
        return aliquota;
    }

    /**
     * Sets the value of the aliquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquota(BigDecimal value) {
        this.aliquota = value;
    }

    /**
     * Gets the value of the valorLiquidoNfse property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiquidoNfse() {
        return valorLiquidoNfse;
    }

    /**
     * Sets the value of the valorLiquidoNfse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiquidoNfse(BigDecimal value) {
        this.valorLiquidoNfse = value;
    }

    /**
     * Gets the value of the descontoIncondicionado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescontoIncondicionado() {
        return descontoIncondicionado;
    }

    /**
     * Sets the value of the descontoIncondicionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescontoIncondicionado(BigDecimal value) {
        this.descontoIncondicionado = value;
    }

    /**
     * Gets the value of the descontoCondicionado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescontoCondicionado() {
        return descontoCondicionado;
    }

    /**
     * Sets the value of the descontoCondicionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescontoCondicionado(BigDecimal value) {
        this.descontoCondicionado = value;
    }

}
