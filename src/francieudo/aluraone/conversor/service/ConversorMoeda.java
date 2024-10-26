package francieudo.aluraone.conversor.service;

import francieudo.aluraone.conversor.modelos.Moeda;

public class ConversorMoeda {

    private ServiceExchangeRateApi rateApi;

    public ConversorMoeda(){

        this.rateApi = new ServiceExchangeRateApi();
    }

    public double exchangeCurrency(Moeda base, Moeda target, double valor){

        return valor * rateApi.getConversionrate(base, target);
    }
}
