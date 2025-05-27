import { Controller, Get, Param, Post } from '@nestjs/common';
import { AppService } from './app.service';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) { }

  @Get(':name')
  getHello(@Param('name') name: string): string {
    return this.appService.getHelloWithName(name);
  }

  @Post(':name')
  createHello(@Param('name') name: string): string {
    return this.appService.getHelloWithName(name);
  }
}
