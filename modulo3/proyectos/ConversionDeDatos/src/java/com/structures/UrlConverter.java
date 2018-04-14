package com.structures;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("com.controllers.UrlConverter")
public class UrlConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        // Variables
        StringBuilder url = new StringBuilder();
        
        // Verifico la cadena
        if (!value.startsWith("http://", 0)) {
            url.append("http://www.");
        }
        url.append(value);
        
        // Devuelvo el valor
        return url.toString();
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }
}
