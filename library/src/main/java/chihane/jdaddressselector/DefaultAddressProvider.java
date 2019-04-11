package chihane.jdaddressselector;

import android.content.Context;



import java.util.ArrayList;

import chihane.jdaddressselector.model.City;
import chihane.jdaddressselector.model.County;
import chihane.jdaddressselector.model.Province;
import chihane.jdaddressselector.model.Street;

public class DefaultAddressProvider implements AddressProvider {
    public DefaultAddressProvider(Context context) {
    }

    @Override
    public void provideProvinces(final AddressReceiver<Province> addressReceiver) {

        addressReceiver.send(new ArrayList<Province>());
    }

    @Override
    public void provideCitiesWith(int provinceId, final AddressReceiver<City> addressReceiver) {

        addressReceiver.send(new ArrayList<City>());
    }

    @Override
    public void provideCountiesWith(int cityId, final AddressReceiver<County> addressReceiver) {

        addressReceiver.send(new ArrayList<County>());
    }

    @Override
    public void provideStreetsWith(int countyId, final AddressReceiver<Street> addressReceiver) {

        addressReceiver.send(new ArrayList<Street>());
    }
}
