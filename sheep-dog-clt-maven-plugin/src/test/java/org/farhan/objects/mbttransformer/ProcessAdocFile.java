package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface ProcessAdocFile {

    public void assertContent(HashMap<String, String> keyMap);

    public void setContent(HashMap<String, String> keyMap);
}
