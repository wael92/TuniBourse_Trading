package persistance;

// Generated 7 avr. 2013 21:24:23 by Hibernate Tools 3.4.0.CR1

/**
 * Clients generated by hbm2java
 */
public class Clients implements java.io.Serializable {

	private Integer idClients;
	private Utilisateurs utilisateurs;
	private Integer nbreOrange;
	private Integer nbreTelecom;
	private Integer nbreTunisiana;

	public Clients() {
	}

	public Clients(Utilisateurs utilisateurs, Integer nbreOrange,
			Integer nbreTelecom, Integer nbreTunisiana) {
		this.utilisateurs = utilisateurs;
		this.nbreOrange = nbreOrange;
		this.nbreTelecom = nbreTelecom;
		this.nbreTunisiana = nbreTunisiana;
	}

	public Integer getIdClients() {
		return this.idClients;
	}

	public void setIdClients(Integer idClients) {
		this.idClients = idClients;
	}

	public Utilisateurs getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(Utilisateurs utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Integer getNbreOrange() {
		return this.nbreOrange;
	}

	public void setNbreOrange(Integer nbreOrange) {
		this.nbreOrange = nbreOrange;
	}

	public Integer getNbreTelecom() {
		return this.nbreTelecom;
	}

	public void setNbreTelecom(Integer nbreTelecom) {
		this.nbreTelecom = nbreTelecom;
	}

	public Integer getNbreTunisiana() {
		return this.nbreTunisiana;
	}

	public void setNbreTunisiana(Integer nbreTunisiana) {
		this.nbreTunisiana = nbreTunisiana;
	}

}
