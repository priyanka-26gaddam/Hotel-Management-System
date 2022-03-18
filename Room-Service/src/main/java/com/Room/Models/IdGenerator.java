package com.Room.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="RoomId")
public class IdGenerator
{
@Id
 private String id;
private int sequence;




public IdGenerator()
{

}
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public int getSequence() {
return sequence;
}
public void setSequence(int sequence) {
this.sequence = sequence;
}
public IdGenerator(String id, int sequence) {
super();
id = id;
sequence = sequence;
}
@Override
public String toString() {
return "IdGenerator [id=" + id + ", sequence=" + sequence + "]";
}





}