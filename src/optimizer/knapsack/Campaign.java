package optimizer.knapsack;

import java.util.Objects;

/**
 * Representation of a Campaign with the name of the customer, impressions 
 * for each campaign and the value for each campaign
 * 
 * @author Alberto Lorente Leal, <albll@kth.se>, <a.lorenteleal@gmail.com>
 */
public class Campaign {
    
    private String customer;
    private int impressionsPerCampaign;
    private int valuePerCampaign;

    /**
     * Constructor of Campaign
     * @param customer
     * @param impressionsPerCampaign
     * @param valuePerCampaign 
     */
    public Campaign(String customer, int impressionsPerCampaign, 
            int valuePerCampaign) {
        this.customer = customer;
        this.impressionsPerCampaign = impressionsPerCampaign;
        this.valuePerCampaign = valuePerCampaign;
    }

    
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getImpressionsPerCampaign() {
        return impressionsPerCampaign;
    }

    public void setImpressionsPerCampaign(int impressionsPerCampaign) {
        this.impressionsPerCampaign = impressionsPerCampaign;
    }

    public int getValuePerCampaign() {
        return valuePerCampaign;
    }

    public void setValuePerCampaign(int valuePerCampaign) {
        this.valuePerCampaign = valuePerCampaign;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.customer);
        hash = 97 * hash + this.impressionsPerCampaign;
        hash = 97 * hash + this.valuePerCampaign;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Campaign other = (Campaign) obj;
        if (!other.getCustomer().equals(this.customer)){
            return false;
        }
        if (this.impressionsPerCampaign != other.impressionsPerCampaign) {
            return false;
        }
        if (this.valuePerCampaign != other.valuePerCampaign) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Campaign{" + "customer=" + customer + 
                ", impressionsPerCampaign=" + impressionsPerCampaign 
                + ", valuePerCampaign=" + valuePerCampaign + '}';
    }
    
    
    
}
