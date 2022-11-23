package burcBulanProgram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int month, day;
		String burc = "";
		boolean isError = false;

		Scanner input = new Scanner(System.in);
		System.out.println("ay ");
		month = input.nextInt();

		System.out.println("gün ");
		day = input.nextInt();

		if (day >= 1 && day <= 31) {
		 if (month == 1) {		
				if (day < 22) {
				System.out.println("oğlak");
				} else {
					System.out.println("kova");
				}
			}
		}

		if (day >= 1 && day <= 28) {
		if (month == 2) {
				if (day < 20) {
					System.out.println("kova");
				} else {
					System.out.println("balık");
				}
			} 
		}

		if (day >= 1 && day <= 31) {
		if (month == 3) {
				if (day < 20) {
					System.out.println("balık");
				} else {
					System.out.println("koç");
				}
			} 
		}
			if (day >= 1 && day <= 31) {
		if (month == 4) {
			if (day >= 1 && day <= 30) {
				if (day < 21) {
					System.out.println("koç");
				} else {
					System.out.println("boğa");
				}
			}
		}

		if (day >= 1 && day <= 31) {
		if (month == 5) {
				if (day < 22) {
					System.out.println("boğa");
				} else {
					System.out.println("ikizler");
				}
			} 
		}

		if (day >= 1 && day <= 30) {
		if (month == 6) {
				if (day < 22) {
					System.out.println("ikizler");
				} else {
					System.out.println("yengeç");
				}
			} 
		}

		if (day >= 1 && day <= 31) {
		if (month == 7) {
				if (day < 22) {
					System.out.println("yengeç");
				} else {
					System.out.println("aslan");
				}
			} 
		}

		if (day >= 1 && day <= 21) {
		if (month == 8) {
				if (day < 20) {
					System.out.println("aslan");
				} else {
					System.out.println("başak");
				}
			} 
		}

		if (day >= 1 && day <= 30) {
		if (month == 2) {
				if (day < 21) {
					System.out.println("başak");
				} else {
					System.out.println("terazi");
				}
			} 
		}

		if (day >= 1 && day <= 31) {
		if (month == 10) {
				if (day < 22) {
					System.out.println("terazi");
				} else {
					System.out.println("akrep");
				}
			} 
		}

		if (day >= 1 && day <= 30) {
		if (month == 11) {
				if (day < 22) {
					System.out.println("akrep");
				} else {
					System.out.println("yay");
				}
			} 
		}

		if (day >= 1 && day <= 31) {
		if (month == 12) {
				if (day < 21) {
					System.out.println("yay");
				} else {
					System.out.println("oğlak");
				}
			} 
		}
		

		/*switch (month) {
		case 1:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "oğlak";
				} else {
					burc = "kova";
				}
			} else {
				isError = true;
			}

			break;

		case 2:
			if (day >= 1 && day <= 28) {
				if (day < 20) {
					burc = "kova";
				} else {
					burc = "balık";
				}
			} else {
				isError = true;
			}

			break;
		case 3:
			if (day >= 1 && day <= 31) {
				if (day < 20) {
					burc = "balık";
				} else {
					burc = "koç";
				}
			} else {
				isError = true;
			}

			break;

		case 4:
			if (day >= 1 && day <= 31) {
				if (day < 20) {
					burc = "koç";
				} else {
					burc = "boğa";
				}
			} else {
				isError = true;
			}

			break;
		case 5:
			if (day >= 1 && day <= 31) {
				if (day < 21) {
					burc = "boğa";
				} else {
					burc = "ikizler";
				}
			} else {
				isError = true;
			}

			break;
		case 6:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "ikizler";
				} else {
					burc = "yengeç";
				}
			} else {
				isError = true;
			}

			break;
		case 7:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "yengeç";
				} else {
					burc = "aslan";
				}
			} else {
				isError = true;
			}

			break;
		case 8:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "aslan";
				} else {
					burc = "başak";
				}
			} else {
				isError = true;
			}

			break;
		case 9:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "başak";
				} else {
					burc = "terazi";
				}
			} else {
				isError = true;
			}

			break;
		case 10:
			if (day >= 1 && day <= 31) {
				if (day < 22) {
					burc = "terazi";
				} else {
					burc = "akrep";
				}
			} else {
				isError = true;
			}

			break;
		case 11:
			if (day >= 1 && day <= 31) {
				if (day < 21) {
					burc = "akrep";
				} else {
					burc = "yay";
				}
			} else {
				isError = true;
			}

			break;
		case 12:
			if (day >= 1 && day <= 31) {
				if (day < 21) {
					burc = "yay";
				} else {
					burc = "oğlak";
				}
			} else {
				isError = true;
			}

			break;
		default:
			isError = true;
		}

		if (isError) {
			System.out.println("hatalı giriş,tekrar deneyiniz");
		} else {
			System.out.println("burcunuz :" + burc);
		}
		*/
	}
	
	}
}
