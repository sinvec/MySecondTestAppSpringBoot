package ru.motorin.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    /***
     * Уникальный идентификатор сообщения
     */
    @NotBlank(message = "Не заполнено поле UID")
    @Size(max = 32, message = "{validation.name.size.too_long}")
    private String uid;
    /***
     * Уникальный идентификатор операции
     */
    @NotBlank(message = "Не заполнено поле operationUid")
    @Size(max = 32, message = "{validation.name.size.too_long}")
    private String operationUid;
    /***
     * Имя системы отправителя
     */
    private String systemName;
    /***
     * Время создания сообщения
     */
    @NotBlank(message = "Не заполнено поле systemTime")
    private String systemTime;
    /***
     * Наименование ресурса
     */
    private String source;
    /***
     * Должность сотрудника
     */
    private Positions position;
    /***
     * ЗП сотрудника
     */
    private Double salary;
    /***
     * Коэффициент ежегодной премии
     */
    private Double bonus;
    /***
     * Количество отработанных дней
     */
    private Integer workDays;
    /***
     * Уникальный идентификатор коммуникации
     */
    @Min(1)
    @Max(100000)
    private int communicationId;
    /***
     * Уникальный идентификатор шаблона
     */
    private int templateId;
    /***
     * Код продукта
     */
    private int productCode;
    /***
     * Смс код
     */
    private int smsCode;

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' + 
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", bonus='" + bonus + '\'' +
                ", workDays='" + workDays + '\'' +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productCode=" + productCode +
                ", smsCode=" + smsCode +
                '}';
    }

}
