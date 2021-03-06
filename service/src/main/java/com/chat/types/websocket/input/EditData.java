package com.chat.types.websocket.input;

import com.chat.tools.Tools;
import com.chat.types.JSONWriter;

import java.io.IOException;

/**
 * Created by tyler on 6/11/16.
 */
public class EditData implements JSONWriter {
    private Long id;
    private String edit;

    public EditData(Long id, String edit) {
        this.id = id;
        this.edit = edit;
    }

    public EditData() {}

    public Long getId() {
        return id;
    }

    public String getEdit() {
        return edit;
    }

    public static EditData fromJson(String editDataStr) {

        try {
            return Tools.JACKSON.readValue(editDataStr, EditData.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}