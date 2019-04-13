package com.globme.idenftit.utils.mapper;

import com.globme.idenftit.identity.model.Card;
import com.supremainc.BS2CSNCard;

public class CardMapper {
    Card card;
    public Card getCard(BS2CSNCard bs2CSNCard){
        Card card = new Card();

        card.setType(bs2CSNCard.getType());
        card.setSize(bs2CSNCard.getSize());
        card.setData(bs2CSNCard.getData());
        return card;
    }
}
