package ooPolimorfismo.interfaces;

public interface Payable {
    double getPaymentAmount();

    default String getTesteDefault() {
        return "teste do default na interface";
    };
}
