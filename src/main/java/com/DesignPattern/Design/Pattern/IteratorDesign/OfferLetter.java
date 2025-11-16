package com.DesignPattern.Design.Pattern.IteratorDesign;

public class OfferLetter implements Collection{
    private String[] offerLetter = {"Media.net", "Morgan Stanly", "SAS", "Siemens"};

    @Override
    public Iterator getIterator() {
        return new OfferIterator();
    }

    public class OfferIterator implements Iterator{
        int index = 0;

        @Override
        public boolean hasNext(){
            return index < offerLetter.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return offerLetter[index++];
            }
            return null;
        }
    }
}
