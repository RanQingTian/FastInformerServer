package InformerService;

import BasicObjects.Acknowledgement;
import BasicObjects.Message;
import BasicObjects.MessageRecord;

public class MessageManagement {
	public Message createUnfilledMessage(){
		Message msg= new Message();
		//method()将该条消息存入数据库
		return msg;
	}
	
	public void completeUnfilledMessage(Message msg){
		//method()在数据库中搜索msg.id对应的消息，搜索成功之后调用
//		msg.copyTo("搜索到的消息")
	}
	
	public void sendMessage(Message msg){
		//method()调用发送消息的方法，发送成功后修改消息状态
		//if succeed, msg.send_status="Sended".
	}
	
	public void updateRecord(Acknowledgement ack,MessageRecord msgrd){
		//method()调用查找回馈记录的方法
		msgrd.check_date=ack.check_date;
		msgrd.status="Checked";
	}
	
}
