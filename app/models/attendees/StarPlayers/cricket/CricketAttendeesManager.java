package models.attendees.StarPlayers.cricket;

import java.util.ArrayList;
import java.util.List;

import services.attendees.starPlayers.AttendeesDB;
import services.attendees.starPlayers.SoccerAttendeesInfoActor;
import play.mvc.*;
import akka.actor.ActorSystem;
import akka.actor.ActorRef;
import play.api.libs.concurrent.*;

import com.google.inject.Inject;

import models.attendees.AttendeesManager;

public class CricketAttendeesManager  implements AttendeesManager {
	
	private AttendeesDB attendeesDB;

	@Inject
	public CricketAttendeesManager(AttendeesDB attendeesDB) {
		System.out.println("Creatin CricketAttendeesManager");
		this.attendeesDB = attendeesDB;
	}

	@Override
	public List<String> getAll() { return (this.attendeesDB.getAll()); }

	@Override
	public String getBySurname(String surname) { return (this.attendeesDB.getBySurname(surname)); }
		
	@Override
	public Integer attendeeCount() { return (this.attendeesDB.attendeeCount()); }

	@Override
	public Integer addNewAttendee(String surname, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}
}