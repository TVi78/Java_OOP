package patterns.structural.wrappers.adapter.task.mapper.xml;

import java.util.ArrayList;
import java.util.Map;

import patterns.structural.wrappers.adapter.task.converter.Converter;
import patterns.structural.wrappers.adapter.task.mapper.Mapper;

public class XMLAdapter implements Mapper{
    private Converter converter;

    public XMLAdapter(Converter converter) {
        this.converter=converter;
    }

    @Override
    public String map(Map<String, String> data) {
        return converter.convert(new ArrayList<>(data.keySet()), new ArrayList<>(data.values()));
    }
    
}
