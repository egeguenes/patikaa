public class Store extends NormalLocation {
	
	public Store(Player player) {
		super( player , "Store" );
	}

	@Override
	public boolean onLocation() {
		System.out.println("----------Wilkommen zum Store!----------");
		boolean showMenu = true;
		while (showMenu) {
			System.out.println("1-Waffen\n" + "2-Armors\n" + "3-Exit\n");
			System.out.print("Deine Wahl : ");
			int select = scan.nextInt();
			while (select < 1 || select > 3) {
				System.out.print("Out of Index, Such noch mal aus : ");
				select = scan.nextInt();
			}
			switch (select) {
				case 1 :
					printWeapon();
					buyWeapon();
					break;
				case 2 :
					printArmor();
					buyArmor();
					break;
				case 3 :
					System.out.println("Viel Erfolg mit der Saga!");
					showMenu = false;
					return true;
			}
		}
		return true;
	}

	public void printWeapon() {
		System.out.println("----------Waffen----------\n");
		System.out.println("0 - Rausgehen");
		for (Weapon w : Weapon.weapons()) {
			System.out.println(w.getID() + " - " + w.getName() + " <Preis : " + w.getPrice() + " , Damage : " + w.getDamage() + ">");
		}
		System.out.println();
	}

	public void buyWeapon() {
		System.out.print("Such dir eine Waffe aus : ");
		int selectWeaponID = scan.nextInt();
		while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
			System.out.println("Invalid Index!");
			selectWeaponID = scan.nextInt();
		}
		if ( selectWeaponID != 0 ) {
			Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

			if (selectedWeapon != null) {
				if ( selectedWeapon.getPrice() > this.getPlayer().getMoney() ) {
					System.out.println("Ach Aermer, du kannst dir das leider nicht leisten...");
				} else {
					if (selectedWeapon.getName().equals(this.getPlayer().getInventory().getWeapon().getName())) {
						System.out.println("Du hast schon diese Waffe!");
						System.out.println("Daher ist der Kauf nicht erfolgreich!");
					} else {
						// Kauf ist erfolgreich!
						System.out.println(selectedWeapon.getName() + " wurde gekauft!");
						int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
						this.getPlayer().setMoney(balance);
						System.out.println("Aktuelles Geld : " + this.getPlayer().getMoney() + "!");
						System.out.println("Letzte Waffe : " + this.getPlayer().getInventory().getWeapon().getName() + " | neue Waffe : "
						+ selectedWeapon.getName());
						this.getPlayer().getInventory().setWeapon(selectedWeapon);
					}			
				}
			}
		} else {
			System.out.println("Hey, du haettes was kaufen sollen!");
		}

		
	}

	public void printArmor() {
		System.out.println("----------Armors----------\n");
		System.out.println("0 - Rausgehen");
		for (Armor a : Armor.armors()) {
			System.out.println(a.getID() + " - "  + a.getName() + " <Preis : " + a.getPrice() + " , Armor : " + a.getBlock() + ">");
		}
		System.out.println();
	}

	public void buyArmor() {
		System.out.print("Such dir ein Armor aus : ");
		int selectedArmorID = scan.nextInt();
		while (selectedArmorID < 0 || selectedArmorID > Armor.armors().length ) {
			System.out.println("Invalid Index!");
			selectedArmorID = scan.nextInt();
		}
		if ( selectedArmorID != 0 ) {
			Armor selectedArmor = Armor.getArmorObjByID(selectedArmorID);

			if ( selectedArmor != null ) {
				if ( selectedArmor.getPrice() > this.getPlayer().getMoney() ) {
					System.out.println("Ach, Aermer du kannst dir das leider nicht leisten...");
				} else {
					if ( this.getPlayer().getInventory().getArmor().getName().equals(selectedArmor.getName())) {
						System.out.println("Du hast schon dieses Armor!");
						System.out.println("Daher ist der Kauf nicht erfolgreich!");
					} else {
						// Kauf ist erfolgreich;
						System.out.println(selectedArmor.getName() + " wurde geakuf!");
						int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
						this.getPlayer().setMoney(balance);
						System.out.println("Aktuelles Geld : " + this.getPlayer().getMoney() + "!");
						System.out.println("Letztes Armor : " + this.getPlayer().getInventory().getArmor().getName() + " | neues Armor : "
						+ selectedArmor.getName());
						this.getPlayer().getInventory().setArmor(selectedArmor); 
					}
				}
			}
		} else {
			System.out.println("Hey, du haettes was kaufen sollen!");
		}
	}
}